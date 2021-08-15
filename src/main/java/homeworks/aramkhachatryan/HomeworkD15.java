// Exercise 15
// Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
// The string length will be at least 2.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD15 {
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
        System.out.println(rotat(str));
    }

    public static String rotat(String str) {
        String first2chars = str.substring(0, 2);
        str = str.substring(2, str.length());
        str = str + first2chars;
        return str;
    }
}