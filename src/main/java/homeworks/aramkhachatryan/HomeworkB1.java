//  Take a number from input between 1-7. Output the corresponding day of week.
//  Test Data: 1, Expected Output: Monday
//  Test Data: 7, Expected Output: Sunday
//  Test Data: 8, Expected Output: Invalid day range

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkB1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number of day: ");
        int num = input.nextInt();
        if ((num >= 1) && (num <= 7)) {
            if (num == 1) {
                System.out.print("Monday");
            }
            if (num == 2) {
                System.out.print("Tuesday");
            }
            if (num == 3) {
                System.out.print("Wednesday");
            }
            if (num == 4) {
                System.out.print("Thursday");
            }
            if (num == 5) {
                System.out.print("Friday");
            }
            if (num == 6) {
                System.out.print("Saturday");
            }
            if (num == 7) {
                System.out.print("Sunday");
            }
        } else {
            System.out.println("Invalid day range");
        }
    }
}