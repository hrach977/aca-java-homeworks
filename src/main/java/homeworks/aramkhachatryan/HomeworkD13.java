// Exercise 13
// Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
// The string length will be at least 2.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD13 {
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
        System.out.println(concat(str));
    }

    public static String concat(String str) {
        str = str.substring(str.length() - 2);
        str = str + str + str;
        return str;
    }
}