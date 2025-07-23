package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args){
        // Creating new file
        try{
            File fo = new File("newFile.txt");
            fo.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        // Writing
        try{
            FileWriter fw = new FileWriter("newFile.txt");
            fw.write("Hari OM!");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
