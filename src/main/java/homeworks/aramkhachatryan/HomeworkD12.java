// Exercise 12
// Given two strings, a and b, return the result of putting them together in the order abba,
// e.g. "Hi" and "Bye" returns "HiByeByeHi".

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD12 {
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
        return str1 + str2 + str2 + str1;
    }
}
