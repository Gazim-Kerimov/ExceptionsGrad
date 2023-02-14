package ExportData;

import java.io.File;
import java.util.ArrayList;

public class FileManager {
    private static FileManager instance;
    private FileManager(){}
    public static FileManager getInstance(){
        if(instance==null) instance = new FileManager();
        return instance;
    }


    private File checkFileName(String name){
        File file = new File("/Users/gazimkerimov/IdeaProjects/Exc_Grad/src/ExportData/"+name+".txt");
        if(file.exists()) return file;
        else return FileCreator.createNewFile(name);
    }

    public void exportData(ArrayList<String> userData){
       File file = checkFileName(userData.get(0));
       FileCreator fileCreator = new FileCreator();
       fileCreator.writeToFile(userData,file);
    }
}
