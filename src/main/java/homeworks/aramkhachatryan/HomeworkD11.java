// Exercise 11
// Given a string and a second "word" string,
// we'll say that the word matches the string if it appears
// at the front of the string, except
// its first char does not need to match exactly.
// On a match, return the front of the string,
// or otherwise return the empty string.
// So, with the string "hippo" the word "hi" returns "hi"
// and "xip" returns "hip".
// The word will be at least length 1.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word (at least 1 length) and a string.");
        System.out.print("String: ");
        String str = input.next();
        System.out.print("Word: ");
        String word = input.next();
        System.out.println(match(str, word));
    }

    public static String match(String str, String word) {
        String checkS = str.substring(1, word.length());
        String checkW = word.substring(1, word.length());
        if (checkS.equals(checkW)){
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }
}