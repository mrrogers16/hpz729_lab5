package edu.utsa.cs3443.hpz729_lab5.model;

public class Triceratops extends Chasmosaurine
{
    public Triceratops(String name, String type, String currentZone, String location, boolean vegetarian)
    {
        super(name, type, currentZone, location, vegetarian);
    }

    @Override
    public String getSubType()
    {
        return "Triceratops";
    }


    /**
     * @return
     */
    @Override
    public String getCurrentZone() {
        return currentZone;
    }
}
