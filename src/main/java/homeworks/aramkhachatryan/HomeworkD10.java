// Exercise 10
// Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
// The string may be any length. If there are fewer than 2 chars, use whatever is there.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = input.next();
        System.out.println(repeat(str));
    }

    public static String repeat(String str) {
        String result;
        result = str.substring(0,2);
        result = result+result+result;
        return result;
    }
}
