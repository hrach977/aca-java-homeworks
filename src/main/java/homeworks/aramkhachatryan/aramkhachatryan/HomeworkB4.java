//  Prompt user to input a single character. Print Vowel or Consonant, depending on the user input.
//  If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print and error message.
//  Test Data: a Expected Output: Vowel
//  Test Data: G Expected Output: Consonant
//  Test Data: ac Expected Output: Error. Not a single character
//  Test Data: $ Expected Output: Error. Not a letter.
//  NOTE: in case needed, check out these URLs: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html, https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkB4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a single character: ");
        String str = input.next();
        char inpchar = str.charAt(0);
        int dec = inpchar;
        if ((str.length()) > 1) {
            System.out.println("Error. Not a single character.");
        } else if ((dec < 65) || (dec > 122) || ((dec > 90) && (dec < 97))){
            System.out.println("Error. Not a letter.");
        } else {
            switch (inpchar) {
                case 'a' -> System.out.println("Vowel");
                case 'e' -> System.out.println("Vowel");
                case 'i' -> System.out.println("Vowel");
                case 'o' -> System.out.println("Vowel");
                case 'u' -> System.out.println("Vowel");
                case 'A' -> System.out.println("Vowel");
                case 'E' -> System.out.println("Vowel");
                case 'I' -> System.out.println("Vowel");
                case 'O' -> System.out.println("Vowel");
                case 'U' -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
            }
        }
    }
}