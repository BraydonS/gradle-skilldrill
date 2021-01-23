package edu.isu.cs.cs2263;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.io.Reader;
import java.nio.file.Paths;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
public class IOManager {
    
    public IOManager(){}
    

    public void writeData(String file, ArrayList<Student> students) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter("studentdata.txt");

        gson.toJson(students, writer);
        writer.close();
      
    }

    public List<Student> readData(String file) {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get(file));
        Type arrayType = new TypeToken<ArrayList<Student>>(){}.getType();
        List<Student> returnList = gson.fromJson(reader, arrayType);
        return returnList;
     }
}
