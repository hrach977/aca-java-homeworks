// Exercise 18
// Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
// You may assume that n is between 0 and the length of the string, inclusive.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string and an integer number.");
        System.out.print("String: ");
        String str = input.next();
        System.out.print("Integer: ");
        int n = input.nextInt();
        System.out.println(repeat(str, n));
    }

    public static String repeat(String str, int n) {
        String result;
        if (n <= str.length()) {
            result = str.substring(str.length() - n);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(result);
            }
            return sb.toString();
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(str);
            }
            return sb.toString();
        }
    }
}