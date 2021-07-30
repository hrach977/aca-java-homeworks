package homeworks.aramazd.poghosyan.homework2;

/*
*   Take two integers from input. Output true if either of them is in the range 10..20 inclusive.
*   Test Data: 12, 1000
*   Expected Output: True
*/

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        boolean isTrue = ((num1 >= 10 && num1 <= 20) || (num2 >= 10 && num2 <= 20));

        System.out.println(isTrue);

    }
}
