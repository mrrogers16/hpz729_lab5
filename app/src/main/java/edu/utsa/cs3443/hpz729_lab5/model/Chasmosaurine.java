package edu.utsa.cs3443.hpz729_lab5.model;

public abstract class Chasmosaurine implements Dinosaur{

    String name;
    boolean vegetarian;


    //Dinosaur->Chasmosaurine
    public Chasmosaurine(String name, boolean vegetarian)
    {
        this.name = name;
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
    //Abstract method getSubType for subclass
    public abstract String getSubType();

}
