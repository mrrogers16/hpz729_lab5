package edu.utsa.cs3443.hpz729_lab5.model;

public class Apatosaurus extends Sauropod {
    // Constructor
    public Apatosaurus(String name, boolean vegetarian, int zoneID) {
        super(name, vegetarian, zoneID);
    }

    //Sauropod->Apatosaurus-subType: Getter
    @Override
    public String getSubType() {
        return "Apatosaurus";
    }
}

