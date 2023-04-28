package edu.utsa.cs3443.hpz729_lab5.model;

public class Zone {

    private String zoneName;
    private String risk_level;
    private String zone_abbreviation;
    private int guest_count;

    /**
     * Zone Constructor
     * @param
     */
    public Zone(String zoneName, String risk_level, String zone_abbreviation, int guest_count)
    {
        this.zoneName = zoneName;
        this.risk_level = risk_level;
        this.zone_abbreviation = zone_abbreviation;
        this.guest_count = guest_count;
    }
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getRisk_level() {
        return risk_level;
    }

    public void setRisk_level(String risk_level) {
        this.risk_level = risk_level;
    }

    public String getZone_abbreviation() {
        return zone_abbreviation;
    }

    public void setZone_abbreviation(String zone_abbreviation) {
        this.zone_abbreviation = zone_abbreviation;
    }

    public int getGuest_count() {
        return guest_count;
    }

    public void setGuest_count(int guest_count) {
        this.guest_count = guest_count;
    }


    //Use hashmap for VegetarianMap
    //public class VegetarianMap extends HashMap<String, Boolean> {}
    //this extends hashmap but only uses the String key with Boolean value
        //public VegetarianMap(input stream from file,vegetarian Data)(constructor)
            //super();
            //load(vegetarianData);
            //hashmap has put and get methods

    //private load(inputstream, vegetarianData){
    //      populate the list: put("Theropod", false) these will not be hardcoded.
    //      loop through to populate hashmap
    // }
    //will run when park is created or Main Activity is ran



    //Maybe MAIN
    //BufferedFileReader bfr = new BufferedFileReader("myfile.txt");
    //String line = bfr.readLine()

    //Write a dinosaur maker class to aggregate all dino data
    //dino.csv: jojo, Velociraptor, B
    //Use velociraptor name to correlate with supertype and determine if isVegetarian.
    //Use reflection to determine supertype
    //There is a class named Class. It represents the Class you have written yourself.
    //Class.forName("Velociraptor");
    //This will return an object that represents the class itself
    //Class.forName("Velociraptor").getSuperClass(); This will return the theropod class.
    //Next we need to turn it into a string.
    //Class.forName("Velociraptor").getSuperClass().getSimpleName();
    //This will then return the name of the velociraptor super class which is Theropod

    //number of guests in the park will never change

    //Zone contains information in zone.csv
    //Park unchanged
    //ZonedPark extends Park with methods
        //addZone(from zones.csv)
        //getZone
        //getDinoByZone(will go through the dino array and return by zone)
        //getDinosaur(takes in name of dino and returns associated dino object)
        //relocate

    //update toString() methods to include Zones

    //DinoMake ZoneParkMaker classes will be used

    //public class ZoneParkMaker(all three input streams)
        //makeZonedPark(inputStreams, (dinosaurs, types, and zones)
        //


    //#1 Get the number of Dinosaurs by opening up dino.csv.
    //#2 Create a zoned park object(name of the park, number of dinos)
    //#3 Create the vegetarianMap from types.csv
    //#4 Pass data from each line of dino.csv and vegetarianMap to DinosaurMaker to create a dinosaur
    //#5 Add the Dinosaur to the park
    //#6 Read and store the zone data from zones.csv and return the zone for the Park

    //Relocate throws exception
    //Mispelled dinos, non existent zones use toast messages to tell user incorrect inputs
















    //DONE------------------------------------------------------------------------------------------


    //REUSE BufferReader
    //public BufferedFileReader extends BufferedReader()
    //  private String fileName;
    //public BufferedFileReader(String filename)
    //{
    //    super(new FileReader(fileName));
    //    this.fileName = fileName;
    //}
    //public String getFileName()
    //{
    //    return fileName;
    //}


}
