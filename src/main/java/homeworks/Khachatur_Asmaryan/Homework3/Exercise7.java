package homeworks.Khachatur_Asmaryan.Homework3;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
       String word1 = "Candy";
       String word2 = "and";
       Scanner input = new Scanner(System.in);
        System.out.println("Please write a new word to attach to the words");
       String newword = input.next();
       writesentence(word1, word2, newword);
    }
    public static void writesentence(String word1, String word2, String newword) {
        System.out.println(word1 + " " + word2 + " " + newword);
    }

}
