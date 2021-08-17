// Exercise 19
// Write a method that returns true if for every '*' (star) in the string,
// if there are chars both immediately before and after the star, they are the same.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string and a symbol.");
        System.out.print("String: ");
        String str = input.next();
        System.out.print("Symbol: ");
        String symbol = input.next();
        System.out.println(symbcheck(str, symbol));
    }

    public static boolean symbcheck(String str, String symbol) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (symbol.charAt(0) == str.charAt(i)) {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}