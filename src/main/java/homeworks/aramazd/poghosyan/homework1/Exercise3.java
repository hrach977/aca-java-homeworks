package homeworks.aramazd.poghosyan.homework1;

/*
*   Take a number from input.
*   Print its multiplication table up to 10
*   Test Data: 8
*   Expected Output:
*       8 * 1 = 8
*       8 * 2 = 16
*       8 * 3 = 24
*       ...
*       8 * 10= 80
 */

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        int inputNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number: ");
        inputNumber = scanner.nextInt();

        for (int i = 1; i <= inputNumber; i++) {
            System.out.println(i + " * " + inputNumber + " = " + (i * inputNumber));
        }


    }

}
