//  Take a year from input. Output whether that year is a leap year or not.
//  Test Data: 2016 Expected Output: true

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkB5b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}