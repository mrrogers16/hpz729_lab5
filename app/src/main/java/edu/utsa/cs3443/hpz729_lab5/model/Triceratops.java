package edu.utsa.cs3443.hpz729_lab5.model;

public class Triceratops extends Chasmosaurine
{
    /**
     * Constructor - Triceratops
     * @param name - String name
     * @param type - String type
     * @param currentZone - String currentZone
     * @param location - String location
     * @param vegetarian - boolean vegetarian
     */
    public Triceratops(String name, String type, String currentZone, String location, boolean vegetarian)
    {
        super(name, type, currentZone, location, vegetarian);
    }

    /**
     *
     * @return - String "Triceratops"
     */
    @Override
    public String getSubType()
    {
        return "Triceratops";
    }


    /**
     * @return - String currentZone
     */
    @Override
    public String getCurrentZone() {
        return currentZone;
    }
}
