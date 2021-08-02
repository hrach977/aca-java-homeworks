package homeworks.robert.mkhitaryan.homework1;

import java.util.Scanner;

public class Exercise4 {
//    Prompt user to input a single character. Print Vowel or Consonant, depending on the user input.
//    If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print and error message.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a single character: ");
        String str = input.next();
        if (str.length() == 1) {
            if (str.matches("[a-z]|[A-Z]")) {
                if (str.matches("[a]|[e]|[i]|[o]|[u]|[A]|[E]|[|I]|[O]|[U]")) {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error. Not a letter");
            }
        } else {
            System.out.println("Error. Not a single character");
        }
    }
}
