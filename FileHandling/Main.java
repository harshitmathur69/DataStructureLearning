package FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.print("Enter some letters");
//            int letters = isr.read();
//            while(isr.ready()){
//                System.out.println((char)letters);
//                letters = isr.read();
//            }
//            isr.close();
//            System.out.println();
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
        try(FileReader fr = new FileReader("note.txt")){
            int letters = fr.read();
            while(fr.ready()){
                System.out.print((char)letters);
                letters = fr.read();
            }
            fr.close();
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
