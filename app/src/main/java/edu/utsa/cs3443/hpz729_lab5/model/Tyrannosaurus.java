package edu.utsa.cs3443.hpz729_lab5.model;

public class Tyrannosaurus extends Theropod
{

    //Constructor
    public Tyrannosaurus(String name, boolean vegetarian, int zoneID)
    {
        super(name, vegetarian, zoneID);
    }
    //Theropod->Tyrannosaurus-subType: Getter
    @Override
    public String getSubType()
    {
        return "Tyrannosaurus";
    }

}
