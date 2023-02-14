package ExportData;

import java.io.*;
import java.util.ArrayList;

public class FileCreator {
    public static File createNewFile(String fileName){
        File file = new File("/Users/gazimkerimov/IdeaProjects/Exc_Grad/src/ExportData/" + fileName + ".txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public void writeToFile(ArrayList<String> list, File file){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
            for(int i = 0; i < list.size(); i++){
                bufferedWriter.write(list.get(i) + " ");
            }
            bufferedWriter.write("\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
