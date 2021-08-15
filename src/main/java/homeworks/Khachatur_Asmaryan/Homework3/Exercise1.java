package homeworks.Khachatur_Asmaryan.Homework3;

import static java.lang.Integer.sum;
import static java.lang.Integer.toBinaryString;

public class Exercise1 {
    public static void main(String[] args) {
        writetext("Bob", "Hello", "!");
}
     public static void writetext(String text1, String text2, String text3 ) {
         System.out.println(text1);
         System.out.println(text2 + " " + text1 + text3);
    }
}