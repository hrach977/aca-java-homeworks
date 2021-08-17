// Exercise 8
// Given 2 string a and b, return a new string made of the first char of a and the last char of b.
// So, “yo” and “java” yields “ya”. If either string is length 0, use ‘@’ for its missing char.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two strings.");
        System.out.print("A) ");
        String str1 = input.next();
        System.out.print("B) ");
        String str2 = input.next();
        System.out.println(concat(str1, str2));
    }

    public static String concat(String str1, String str2) {
        String result;
        if (str1.length() == 0) {
            result = "@" + str2.substring(str2.length() - 1);
        } else if (str2.length() == 0) {
            result = str1.substring(0, 1) + "@";
        } else {
            result = str1.substring(0, 1) + str2.substring(str2.length() - 1);
        }
        return result;
    }
}