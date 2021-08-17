// Exercise3
// Given a string of even length, return the first half of the string.
// So the string “WooHoo” yields “Woo”.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD3 {
    public static void main(String[] args) {
        System.out.print("Please enter an even length String: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(first3chars(str));
    }

    public static String first3chars(String inpstring) {
        if (inpstring.length() % 2 == 0) {
            inpstring = inpstring.substring(0, inpstring.length() / 2);
        } else {
            inpstring = "Length of the string you entered is not even";
        }
        return inpstring;
    }
}