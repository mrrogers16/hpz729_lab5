package edu.utsa.cs3443.hpz729_lab5.model;

public class Apatosaurus extends Sauropod {
    // Constructor
    public Apatosaurus(String name, String type, String currentZone, String location, boolean vegetarian) {
        super(name, type, currentZone, location, vegetarian);
    }

    //Sauropod->Apatosaurus-subType: Getter
    @Override
    public String getSubType() {
        return "Apatosaurus";
    }
}

