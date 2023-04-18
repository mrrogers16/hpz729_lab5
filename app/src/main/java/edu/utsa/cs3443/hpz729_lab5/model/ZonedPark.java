package edu.utsa.cs3443.hpz729_lab5.model;

import androidx.annotation.DoNotInline;

import java.security.DigestInputStream;
import java.time.ZoneId;
import java.util.ArrayList;

public class ZonedPark extends Park
{
    private int zoneID;
    private ArrayList<Zone> zoneList = new ArrayList<>();
    private ArrayList<Dinosaur> dinoList = new ArrayList<>();

    public ZonedPark(String name, int max)
    {
        super(name, max);
    }

    public void addZone(int zoneID, ArrayList<Zone> zoneList)
    {
        Zone zone = new Zone(zoneID);
        zoneList.add(zone);
    }

    public Zone getZoneByID(int zoneID, ArrayList<Zone> zoneList)
    {
        for(int i = 0; i < zoneList.size(); i++)
        {
            Zone zone = zoneList.get(i);
            if(zone.getZoneID() == zoneID)
            {
                return zone;
            }
        }
        return null;
    }
    public Dinosaur getDinoByZone(int zoneID, ArrayList<Dinosaur> dinoList)
    {
        for(int i = 0; i < dinoList.size(); i++)
        {
            Dinosaur dino = dinoList.get(i);
            if(dino.getZone() == zoneID)
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