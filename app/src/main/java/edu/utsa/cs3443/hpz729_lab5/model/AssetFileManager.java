package edu.utsa.cs3443.hpz729_lab5.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.AssetFileDescriptor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class AssetFileManager {

    private Context context;
    private String filename;
    private AssetManager assetManager;

    public AssetFileManager(Context context, String filename)
    {
        this.context = context;
        this.filename = filename;
        this.assetManager = context.getAssets();
    }

    public InputStream openAssetFile() throws IOException {
        return assetManager.open(filename);
    }

    public AssetFileDescriptor openAssetFileDescriptor() throws IOException {
        return assetManager.openFd(filename);
    }

    public File getFile() throws IOException {
        return new File(context.getFilesDir(), filename);
    }

    public static InputStream readAssetFile(Context context, String filename) throws IOException {
        AssetFileManager fileManager = new AssetFileManager(context, filename);
        try(InputStream inputStream = fileManager.openAssetFile())
        {
            return inputStream;
        }
    }


}

//    AssetManager assetManager = context.getAssets();
//    InputStream inputStream = assetManager.open(filepath);
//    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));