// Exercise 14
// Given a string, return a version without the first and last char, so "Hello" yields "ell".
// The string length will be at least 2.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        while (true) {
            System.out.print("Please enter string with length at least 2: ");
            str = input.next();
            if (str.length() < 2) {
                System.out.println("String you entered is not valid.");
            } else {
                break;
            }
        }
        System.out.println(substr(str));
    }

    public static String substr(String str) {
        str = str.substring(1, str.length() - 1);
        return str;
    }
}