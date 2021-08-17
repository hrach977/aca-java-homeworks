// Exercise 23
// Return true if the string "cat" and "dog" appear
// the same number of times in the given string.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string. ");
        String str = input.next();
        System.out.println(check(str));
    }

    public static boolean check(String str) {
        int counterCat = 0;
        int counterDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                counterCat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                counterDog++;
            }
        }
        return counterCat == counterDog;
    }
}