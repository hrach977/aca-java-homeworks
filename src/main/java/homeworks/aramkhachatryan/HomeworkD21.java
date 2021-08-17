// Exercise 21
// Given two strings, return true if either of the strings appears at the very end of the other string,
// ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two strings.");
        System.out.print("1st string: ");
        String str1 = input.next();
        System.out.print("2nd string: ");
        String str2 = input.next();
        System.out.println(check(str1, str2));

    }

    public static boolean check(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        return str2.equals(str1.substring(str1.length() - str2.length()));
    }
}