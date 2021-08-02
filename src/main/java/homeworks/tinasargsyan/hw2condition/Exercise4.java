package homeworks.tinasargsyan.hw2condition;
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
        char ch = input.charAt(0);
        if (input.length() > 1) {
            System.out.println("Error.Not a single character");
        }else if ((ch=='a'||ch=='e'||ch=='i'||ch=='o'
                ||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
                System.out.println("Vowel");
        }else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
                System.out.println("Consonant");
        }else {
                System.out.println("Error.Not a Letter!");
        }
    }

}

