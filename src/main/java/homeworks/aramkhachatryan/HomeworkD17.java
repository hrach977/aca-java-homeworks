// Exercise 17
// Given a string, return a string where for every char in the original, there are two chars.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = input.next();
        System.out.println(looper(str));
    }

    public static String looper(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(i, i + 1) + str.substring(i, i + 1);
            result.append(temp);
        }
        return result.toString();
    }
}