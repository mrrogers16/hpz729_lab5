package edu.utsa.cs3443.hpz729_lab5.model;

public abstract class Stegosaur implements Dinosaur
{
    private String name;
    private boolean vegetarian;
    private String type;
    private String currentZone;
    private String location;

    //Stegosaur constructor
    public Stegosaur(String name, String type, String currentZone, String location, boolean vegetarian)
    {
        this.name = name;
        this.type = type;
        this.currentZone = currentZone;
        this.location = location;
        this.vegetarian = vegetarian;

    }
    public void setCurrentZone(String currentZone)
    {
        this.currentZone = currentZone;
    }

    public String getCurrentZone()
    {
        return currentZone;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isVegetarian()
    {
        return vegetarian;
    }

    public void setVeggies(boolean vegetarian)
    {
        this.vegetarian = vegetarian;
    }



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //Stegosaur toString() method
    //Checks boolean value and assigns appropriate carnivore status.
    //returns String built by calling the subclasses getType() and getName() methods
    //and appends carnivore status to vegetarian
    public String toString()
    {
        String vegetarian = null;
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
    //Theropod-type: getter
    //Returns String built by calling getSubType() from subclass
    //and appending to a
    public String getType()
    {
        return "Stegosaur: " + getSubType();
    }
    public void setType(String type) {
        this.type = type;
    }
    //Abstract getSubType for subclass
    public abstract String getSubType();

}
