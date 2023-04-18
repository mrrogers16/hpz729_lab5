package edu.utsa.cs3443.hpz729_lab5.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;

public class BufferedFileReader extends BufferedReader{

    private String filename;

    public BufferedFileReader(String filename) throws FileNotFoundException
    {
        super(new FileReader(filename));
        this.filename = filename;
    }

    public void setFilename(String filename)
    {
        this.filename = filename;
    }
    public String getFilename()
    {
        return filename;
    }
}


//public class BufferedFileReader extends BufferedReader() {
//    public BufferedFileReader(Reader in) {
//        super(in);
//    }
//}
//{
//            private String fileName;
//
//    public BufferedFileReader(String filename)
//        {
//            super(new FileReader(fileName));
//            this.fileName=fileName;
//        }
//
//    public String getFileName()
//        {
//            return fileName;
//        }
//}


    //hashmap has put and get methods

