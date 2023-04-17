package edu.utsa.cs3443.hpz729_lab5.model;

public class Velociraptor extends Theropod
{
    //Constructor
    public Velociraptor(String name, boolean vegetarian)
    {
        super(name, vegetarian);
    }
    //Theropod->Velociraptor-subType: Getter
    @Override
    public String getSubType()
    {
        return "Velociraptor";
    }

}
