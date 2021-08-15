package homeworks.Khachatur_Asmaryan.Homework3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first word");
        String firstword = input.next();
        System.out.println("Please enter the second word");
        String secondword = input.next();
        writeword(firstword, secondword);

    }

    public static void writeword(String text1, String text2) {
        System.out.println(text1 + text2);
    }
}
