package edu.utsa.cs3443.hpz729_lab5.model;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import edu.utsa.cs3443.hpz729_lab5.model.AssetFileManager;
import edu.utsa.cs3443.hpz729_lab5.model.BufferedFileReader;

public class VegetarianMap extends HashMap<String, Boolean> {

    private String filename;
    private InputStream inputStream;

    public VegetarianMap(Context context, String filename) throws IOException {
        super();
        this.filename = filename;
        vegetarianMapLoad(context, filename);
    }
    public void vegetarianMapLoad(Context context, String filename) {
        try {
            AssetManager assetManager = context.getAssets();
            InputStream inputStream = assetManager.open(filename);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length == 2) {
                    String name = tokens[0].trim();
                    boolean isVegetarian = Boolean.parseBoolean(tokens[1].trim());
                    put(name, isVegetarian);
                }
            }
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


