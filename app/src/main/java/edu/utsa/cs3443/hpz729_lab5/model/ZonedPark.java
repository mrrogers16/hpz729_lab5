package edu.utsa.cs3443.hpz729_lab5.model;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ZonedPark extends Park
{
    private static ZonedPark zonedParkInstance;
    private ArrayList<Zone> zoneList = new ArrayList<>();
    private ArrayList<Dinosaur> dinoList = new ArrayList<>();

    private ZonedPark(String name, int max, Context context, String filepath)
    {
        super(name, max);
        try {
            loadZoneCSV(context, filepath);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public ArrayList<Zone> loadZoneCSV(Context context , String filepath) throws IOException {
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open(filepath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] fields = line.split(",");
            if (fields.length == 4) {
                String zoneName = fields[0];
                String risk_level = fields[1];
                String zone_abbreviation = fields[2];
                int guest_count = Integer.parseInt(fields[3]);
                Zone zone = new Zone(zoneName, risk_level, zone_abbreviation, guest_count);
                zoneList.add(zone);
            }
        }
        inputStream.close();
        bufferedReader.close();
        return zoneList;
    }

    public static ZonedPark getZonedParkInstance(String name, int maxCapacity, Context context, String filepath)
    {
        if(zonedParkInstance == null)
        {
            zonedParkInstance  = new ZonedPark(name, maxCapacity, context, filepath);
        }
        return zonedParkInstance;
    }

    public static ZonedPark getZonedParkInstance(){return zonedParkInstance;}


    public void addZone(String currentZone)
    {
        Zone zone = new Zone(currentZone);
        zoneList.add(zone);
    }

    public Zone getZoneByID(String currentZone)
    {
        for(int i = 0; i < zoneList.size(); i++)
        {
            Zone zone = zoneList.get(i);
            if(zone.getCurrentZone().equalsIgnoreCase(currentZone))
            {
                return zone;
            }
        }
        return null;
    }
    public Dinosaur getDinoByZone(String currentZone)
    {
        for(int i = 0; i < dinoList.size(); i++)
        {
            Dinosaur dino = dinoList.get(i);
            if(dino.getCurrentZone().equalsIgnoreCase(currentZone))
            {
                return dino;
            }
        }
        return null;
    }
    public Dinosaur getDinoByName(String dinoName)
    {
        for(int i = 0; i < dinoList.size(); i++)
        {
            Dinosaur dino = dinoList.get(i);
            if(dino.getName().equals(dinoName))
            {
                return dino;
            }
        }
        return null;
    }
}