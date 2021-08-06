package homeworks.tinasargsyan.hw1condition;
/*
Prompt user to input a single character.Print Vowel or Consonant,
depending on the user input.
If the user input is not a letter (between a and z or A and Z),
or is a string of length > 1, print an error message.
 */
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease input a single character");
        String input = sc.nextLine();
        input = input.toLowerCase();

        if (input.length() == 1) {
            char ch = input.charAt(0);
            boolean isLetter = (ch >= 97) && (ch <= 122);
            if (isLetter) {
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u' || ch == 'y') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("not a letter");
            }
        } else {
            System.out.println("not a single symbol");
        }
    }

}

