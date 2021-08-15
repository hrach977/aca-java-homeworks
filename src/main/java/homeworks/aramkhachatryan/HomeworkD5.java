// Exercise 5
// Given a string, and a Boolean parameter front, 
// return a string length 1 from its front, unless front is false, 
// in which case return a string length 1 from its back. 
// The string will be non-empty.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD5 {
    public static void main(String[] args) {
        System.out.print("Please enter any string: ");
        Scanner input = new Scanner(System.in);
        String inpStr = input.next();
        System.out.print("Please enter boolean parameter: ");
        boolean front = input.nextBoolean();
        System.out.print(retStr(inpStr, front));
    }

    public static String retStr(String inpStr, boolean front) {
        String result;
        if (front) {
            result = inpStr.substring(inpStr.length() - 1);
        } else {
            result = inpStr.substring(0, 1);
        }
        return result;
    }
}