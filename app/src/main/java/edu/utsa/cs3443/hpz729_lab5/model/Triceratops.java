package edu.utsa.cs3443.hpz729_lab5.model;

public class Triceratops extends Chasmosaurine
{
    public Triceratops(String name, boolean vegetarian)
    {
        super(name, vegetarian);
    }

    @Override
    public String getSubType()
    {
        return "Triceratops";
    }


}
