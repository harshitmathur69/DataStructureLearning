package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))){
            bw.write("Jai Shree Ram");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
