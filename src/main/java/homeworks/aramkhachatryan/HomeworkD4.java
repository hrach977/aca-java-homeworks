// Exercise 4
// Given 2 strings, return their concatenation, 
// except omit the first char of each. The strings will be at least length 1.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two strings with length at least 1.");
        String str1 = "";
        String str2 = "";
        while (str1.length() <= 1) {
            System.out.print("First string: ");
            str1 = input.next();
            if (str1.length() <= 1)
                System.out.println("String you entered is not valid.");
        }
        while (str2.length() <= 1) {
            System.out.print("Second string: ");
            str2 = input.next();
            if (str2.length() <= 1)
                System.out.println("String you entered is not valid.");
        }
        System.out.print("Concatenated string is: " + concat(str1, str2));
    }

    public static String concat(String str1, String str2) {
        return (str1.substring(1)) + (str2.substring(1));
    }
}