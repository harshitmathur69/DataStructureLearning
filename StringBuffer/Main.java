package StringBuffer;

import java.util.Arrays;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer(); // constructor-1
        StringBuffer sb2 = new StringBuffer("Harshit");
        StringBuffer sb3 = new StringBuffer(30);

        sb.append("WeMakeDevs");
        sb.append(" is nice! ");
//        sb.insert(2," Harshit ");
        sb.replace(1,5,"Harshit");
        sb.delete(1,5);
        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        String sentence = " ddf gf geg hhd";
        System.out.println(sentence.replaceAll("\\s",""));

        String arr = "Harshit Rohit Virat";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(7.3));
    }
}
