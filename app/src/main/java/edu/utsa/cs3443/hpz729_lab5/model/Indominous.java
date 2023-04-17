package edu.utsa.cs3443.hpz729_lab5.model;

public class Indominous extends Theropod{

    public Indominous(String name, boolean vegetarian)
    {
        super(name, vegetarian);
    }

    @Override
    public String getSubType()
    {
        return "Indominous";
    }
}
