package edu.utsa.cs3443.hpz729_lab5.model;

import android.telephony.SignalStrength;

public abstract class Theropod implements Dinosaur
{
    String name;
    boolean vegetarian;
    String type;
    String currentZone;
    String location;
//dino name,type,current zone location
    //Theropod Constructor
    public Theropod(String name, String type, String currentZone, String location, boolean vegetarian)
    {
        this.name = name;
        this.type = type;
        this.currentZone = currentZone;
        this.location = location;
        this.vegetarian = vegetarian;

    }
    public void setZone(String currentZone)
    {
        this.currentZone = currentZone;
    }

    public String getCurrentZone()
    {
        return currentZone;
    }
    //Theropod-name: Getter
    public String getName()
    {
        return name;
    }
    //Theropod-name: Setter
    public void setName(String name)
    {
        this.name = name;
    }
    //Theropod-vegetarian: Getter
    public boolean isVegetarian()
    {
        return vegetarian;
    }
    //Theropod-vegetarian: Setter
    public void setVegetarian(boolean vegetarian)
    {
        this.vegetarian = vegetarian;
    }

    /*Theropod toString method. Checks boolean value and assigns appropriate carnivore status.
    returns String built by calling the subclasses getType() and getName() methods and appends
    carnivore status to vegetarian*/
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
    /*Theropod-type: getter
    Returns String built by calling getSubType()
    from subclass and appending to a string
    */
    public String getType()
    {
        return "Theropod: " + getSubType();
    }
    //Abstract method getSubType for subclass
    public abstract String getSubType();

}
