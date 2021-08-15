// Exercise 7
// Given a string of odd length, return the string length 3 from its middle. 
// So “Candy” yields “and”. The string length will be at least 3.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        while (true) {
            System.out.print("Please enter string of odd length: ");
            str = input.next();
            if (str.length() % 2 == 0) {
                System.out.println("String you entered is not valid.");
                continue;
            }
            break;
        }
        System.out.println("Middle 3 characters of the string are: " + mid3(str));
    }

    public static String mid3(String str) {
        return (str.substring(str.length() / 2 - 1, str.length() / 2 + 2));
    }
}