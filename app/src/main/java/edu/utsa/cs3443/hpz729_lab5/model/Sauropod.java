package edu.utsa.cs3443.hpz729_lab5.model;

public abstract class Sauropod implements Dinosaur
{
    String name;
    boolean vegetarian;
    String type;
    String currentZone;
    String location;


    //Sauropod Constructor
    public Sauropod(String name, String type, String currentZone, String location, boolean vegetarian)
    {
        this.name = name;
        this.type = type;
        this.currentZone = currentZone;
        this.location = location;
        this.vegetarian = vegetarian;

    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String getCurrentZone() {
        return currentZone;
    }

    public void setCurrentZone(String currentZone) {
        this.currentZone = currentZone;
    }
    //Sauropod-name: Getter
    public String getName()
    {
        return name;
    }
    //Sauropod-name: Setter
    public void setName(String name)
    {
        this.name = name;
    }
    //Sauropod-vegetarian: Getter
    public boolean isVegetarian()
    {
        return vegetarian;
    }
    //Sauropod-vegetarian: Setter
    public void setVeggies(boolean vegetarian)
    {
        this.vegetarian = vegetarian;
    }
    /*Sauropod toString method. Checks boolean value and assigns appropriate carnivore status.
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
    /*Sauropod-type: getter
    Returns String built by calling getSubType()
    from subclass and appending to a string
    */
    public String getType()
    {
        return "Sauropod: " + getSubType();
    }
    public void setType(String type)
    {
        this.type = type;
    }
    //Abstract getSubType for subclass
    public abstract String getSubType();
}
