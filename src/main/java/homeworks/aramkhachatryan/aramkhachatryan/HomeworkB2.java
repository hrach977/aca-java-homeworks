//  Take a number from input between 1-7. Output the corresponding day of week.
//  Test Data: 1, Expected Output: Monday
//  Test Data: 7, Expected Output: Sunday
//  Test Data: 8, Expected Output: Invalid day range
//  Solve this exercise using switch statement.

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkB2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number of day: ");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.println("Invalid day range");
                break;
        }
    }
}