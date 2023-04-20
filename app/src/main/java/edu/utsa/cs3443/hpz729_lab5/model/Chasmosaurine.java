package edu.utsa.cs3443.hpz729_lab5.model;

import androidx.annotation.DoNotInline;

public abstract class Chasmosaurine implements Dinosaur{

    String name;
    boolean vegetarian;
    String type;
    String currentZone;
    String location;


    //Dinosaur->Chasmosaurine
    public Chasmosaurine(String name, String type, String currentZone, String location, boolean vegetarian)
    {
        this.name = name;
        this.type = type;
        this.currentZone = currentZone;
        this.location = location;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setVegetarian(boolean vegetarian)
    {
        this.vegetarian = vegetarian;
    }
    public boolean isVegetarian()
    {
        return vegetarian;
    }

    public String toString()
    {
        String vegetarian = "";
        if(this.vegetarian)
        {
            vegetarian = "(not carnivore)";
        }
        else
        {
            vegetarian = "(carnivore)";
        }

        return getType() + " named " + getName() + vegetarian;
    }
    public String getType()
    {
        return "Chasmosaurine: " + getSubType();
    }

    public void setZone(String currentZone)
    {
        this.currentZone = currentZone;
    }

    public String getCurrentZone(String name)
    {
        return currentZone;
    }
    //Abstract method getSubType for subclass
    public abstract String getSubType();

}
