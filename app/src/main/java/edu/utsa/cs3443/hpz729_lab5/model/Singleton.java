package edu.utsa.cs3443.hpz729_lab5.model;

public class Singleton
{
    private static Singleton singletonInstance = null;
    private String name;
    private int maxCap;

    private Singleton(String name, int maxCap)
    {
        this.name = name;
        this.maxCap = maxCap;
    }
    public static Singleton getSingletonInstance(String name, int maxCap)
    {
        if(singletonInstance == null)
        {
            singletonInstance = new Singleton(name, maxCap);
        }
        return singletonInstance;
    }
    public static Singleton getSingletonInstance()
    {
        return singletonInstance;
    }
}
