package homeworks.aramazd.poghosyan.homework2;

/*
*   Take two integers from input between 25 and 75. Output true if there’s a common digit in both numbers.
*   Test Data: 26, 64
*   Expected Output: true
*/

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        System.out.println("Enter 2 numbers between 25 and 75");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int num1_1 = num1 / 10;
        int num1_2 = num1 - (num1_1 * 10);
        int num2_1 = num2 / 10;
        int num2_2 = num2 - (num2_1 * 10);

        if ((num1 >= 25) && (num1 <= 75) && (num2 >= 25) && (num2 <= 75)) {

//        if ((num1_1 == num2_1) || (num1_1 == num2_2) || (num1_2 == num2_1) || (num1_2 == num2_2))
//            System.out.println("true");
//        else
//            System.out.println("false");

            boolean isTrue = (num1_1 == num2_1) || (num1_1 == num2_2) || (num1_2 == num2_1) || (num1_2 == num2_2);
            System.out.println(isTrue);

        } else
            System.out.println("Out of dimensions!");


    }
}
