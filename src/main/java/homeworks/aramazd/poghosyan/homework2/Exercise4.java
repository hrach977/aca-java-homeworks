package homeworks.aramazd.poghosyan.homework2;

/*
*   Prompt user to input a single character. Print Vowel or Consonant, depending on the user input.
*   If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print and error message.
*   Test Data: a Expected Output: Vowel
*   Test Data: G Expected Output: Consonant
*   Test Data: ac Expected Output: Error. Not a single character
*   Test Data: $ Expected Output: Error. Not a letter.
*   NOTE: in case needed, check out these URLs: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html, https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
*/

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String character = scanner.nextLine();
        char symbol;

        if (character.length() > 1)
            System.out.println("Not a single character!");
        else if ((character.charAt(0) > 64) && (character.charAt(0) < 91))
            System.out.println("Consonant!");
        else if ((character.charAt(0) > 96) && (character.charAt(0)) < 123)
            System.out.println("Vowel");
        else
            System.out.println("Not a letter!");


    }
}
