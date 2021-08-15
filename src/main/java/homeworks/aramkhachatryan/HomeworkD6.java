// Given a string, return true if it ends in “ly”.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD6 {
    public static void main(String[] args) {
        System.out.print("Please enter any string: ");
        Scanner input = new Scanner(System.in);
        String inpStr = input.next();
        System.out.print(retbool(inpStr));
    }
    public static boolean retbool(String inpStr) {
        return inpStr.endsWith("ly");
    }
}