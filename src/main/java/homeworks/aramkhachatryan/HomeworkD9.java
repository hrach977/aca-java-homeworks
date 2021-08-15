// Exercise 9
// Given a string, if the string begins with “red” or “blue” return that color string, 
// otherwise return the empty string.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = input.next();
        System.out.println(colorCheck(str));
    }

    public static String colorCheck(String str) {
        String result = "";
        if (str.startsWith("red")) {
            result = "red";
        }
        if (str.startsWith("blue")) {
            result = "blue";
        }
        return result;
    }
}