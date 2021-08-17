// Exercise 16
// Given a string, return a version without both the first and last char of the string.
// The string may be any length, including 0.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = input.next();
        System.out.println(moded(str));
    }

    public static String moded(String str) {
        if (str.length() <= 2) {
            return "";
        }
        str = str.substring(1, str.length() - 1);
        return str;
    }
}