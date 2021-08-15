// Exercise 2
// Given an out string length4, e.g. “<<>>”and a word, 
// return a new string where the word is in the middle of the outstring, 
// e.g. “<<word>>”.Note: you can use String::substring(i, j) to extract 
// the String starting at index i and going up to but not including index j.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any String: ");
        String name = input.next();
        quotmarks(name);
        System.out.print(quotmarks(name));

    }
    public static String quotmarks(String name) {
        String quotmarks = "<<>>";
        name = quotmarks.substring(0,2)+name+quotmarks.substring(2,4);
        return name;
    }
}