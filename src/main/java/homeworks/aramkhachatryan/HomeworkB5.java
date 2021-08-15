//  Take a year from input. Output whether that year is a leap year or not.
//  Test Data: 2016 Expected Output: true

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkB5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}