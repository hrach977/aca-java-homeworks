// Exercise 22
// We'll say that a String is xy-balanced if for all the 'x' chars in the string,
// there exists a 'y' char somewhere later in the string.
// So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
// Return true if the given string is xy-balanced.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD22 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string. ");
        String str = input.next();
        System.out.println(balanced(str));
    }
    public static boolean balanced(String str) {
        int indexX = 0, indexY=0;
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='x') {
                indexX=i;
            }
            if(str.charAt(i)=='y') {
                indexY=i;
            }
        }
        return indexY>indexX;
    }
}