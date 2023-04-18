package edu.utsa.cs3443.hpz729_lab5.model;

import androidx.annotation.DoNotInline;

import java.time.ZoneId;
import java.util.ArrayList;

public class ZonedPark extends Park
{
    private int zoneID;
    private ArrayList<Zone> zoneList = null;
    private ArrayList<Dinosaur> dinoList = null;

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
    //addZone(from zones.csv)
    //getZone
    //getDinoByZone(will go through the dino array and return by zone)
    //getDinosaur(takes in name of dino and returns associated dino object)
    //relocate
}
