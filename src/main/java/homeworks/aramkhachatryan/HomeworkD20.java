// Exercise 20
// Return the number of times that the string "hi" appears anywhere in the given string.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two strings.");
        System.out.print("1st string: ");
        String str1 = input.next();
        System.out.print("2nd string: ");
        String str2 = input.next();
        System.out.println(check(str1, str2));
    }
    public static int check(String str1, String str2) {
        int counter = 0;
        for (int i = 0; i < (str1.length()-str2.length()+1); i++) {
            if (str2.equals(str1.substring(i, i + str2.length()))) {
                counter++;
            }
        }
        return counter;
    }
}