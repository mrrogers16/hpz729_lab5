package edu.utsa.cs3443.hpz729_lab5.model;

public class Velociraptor extends Theropod
{
    //Constructor
    public Velociraptor(String name, String type, String currentZone, String location, boolean vegetarian)
    {
        super(name, type, currentZone, location, vegetarian);
    }
    //Theropod->Velociraptor-subType: Getter
    @Override
    public String getSubType()
    {
        return "Velociraptor";
    }

}
