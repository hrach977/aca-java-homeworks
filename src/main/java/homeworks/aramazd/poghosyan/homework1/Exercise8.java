package homeworks.aramazd.poghosyan.homework1;

import java.util.Scanner;

/*
*   Take two numbers from input.
*   Swap them and print out.
*   Test Data: 10, 20
*   Expected Output:
*       Before swapping X = 10, Y = 20
*       After swapping Y =10, X = 20
 */
public class Exercise8 {
    public static void main(String[] args) {
        int inputNumber1;
        int inputNumber2;
        int buffer;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        inputNumber1 = scanner.nextInt();

        System.out.print("Please enter second number: ");
        inputNumber2 = scanner.nextInt();

        System.out.println("Before swapping X = " + inputNumber1 + ", Y = " + inputNumber2);
        buffer = inputNumber1;
        inputNumber1 = inputNumber2;
        inputNumber2 = buffer;
        System.out.println("After swapping Y = " + inputNumber2 + ", X = " + inputNumber1);
    }
}
