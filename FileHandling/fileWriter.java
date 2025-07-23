package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args){
        try(FileWriter fw = new FileWriter("note.txt",true)){
            fw.write("\n My name is Harshit Mathur");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
