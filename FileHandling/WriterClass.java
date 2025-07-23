package FileHandling;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriterClass {
    public static void main(String[] args){
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write('\n');
            osw.write(98);
            osw.write('\n');
            osw.write('H');
            osw.write('\n');
            char[] arr = "Hello World".toCharArray();
            osw.write(arr);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
