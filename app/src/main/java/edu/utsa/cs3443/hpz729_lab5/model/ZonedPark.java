package edu.utsa.cs3443.hpz729_lab5.model;

import java.util.ArrayList;

public class ZonedPark extends Park
{
    private static ZonedPark zonedParkInstance;
    private ArrayList<Zone> zoneList = new ArrayList<>();
    private ArrayList<Dinosaur> dinoList = new ArrayList<>();

    private ZonedPark(String name, int max)
    {
        super(name, max);
    }

    public static ZonedPark getZonedParkInstance(String name, int maxCapacity)
    {
        if(zonedParkInstance == null)
        {
            zonedParkInstance  = new ZonedPark(name, maxCapacity);
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