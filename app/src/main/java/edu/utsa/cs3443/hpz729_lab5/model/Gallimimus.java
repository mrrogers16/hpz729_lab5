package edu.utsa.cs3443.hpz729_lab5.model;

public class Gallimimus extends Theropod
{
     public Gallimimus(String name, boolean vegetarian)
     {
         super(name, vegetarian);
     }

     @Override
    public String getSubType()
     {
         return "Gallimimus";
     }
}
