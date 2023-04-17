package edu.utsa.cs3443.hpz729_lab5.model;

public class Stegosaurus extends Stegosaur
{
    //Constructor
    public Stegosaurus(String name, boolean vegetarian)
    {
        super(name, vegetarian);
    }

    //Stegosaur->Stegosaurus-subType: Getter
    @Override
    public String getSubType()
    {
        return "Stegosaurus";
    }
}
