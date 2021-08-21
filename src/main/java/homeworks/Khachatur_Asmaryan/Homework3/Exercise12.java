package homeworks.Khachatur_Asmaryan.Homework3;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the symbol");
        String symbol = input.next();
        System.out.println("Please enter a word");
        String word = input.next();
        makeOutWord(symbol, word);


    }
    public static String makeOutWord(String out, String word) {
        return (out.substring(0, 2) + word + out.substring(2, 4));
    }
}
