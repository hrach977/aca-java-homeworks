//  Take two integers from input between 25 and 75. Output true if there’s a common digit in both numbers.
//  Test Data: 26, 64
//  Expected Output: true

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkB6b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integer numbers between 25 and 75");
        System.out.print("A: ");
        int num1 = input.nextInt();
        System.out.print("B: ");
        int num2 = input.nextInt();
        int char11 = num1 / 10;
        int char12 = num1 % 10;
        int char21 = num2 / 10;
        int char22 = num2 % 10;
        if ((num1 > 25) && (num1 < 75) && (num2 > 25) && (num2 < 75)) {
            if (char11 == char21 || char11 == char22 || char12 == char21 || char12 == char22) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.print("One or more numbers are not in the range");
        }
    }
}