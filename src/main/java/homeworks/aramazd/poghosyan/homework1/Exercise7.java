package homeworks.aramazd.poghosyan.homework1;

import java.util.Scanner;

/*
*   Take 5 numbers from input.
*   Output their sum and average.
*   Test Data: 1,2,3,4,5
*   Expected Output:
*       Sum is: 15
*       Average is: 3.0
 */
public class Exercise7 {
    public static void main(String[] args) {
        int inputNumber1, inputNumber2, inputNumber3, inputNumber4, inputNumber5;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        inputNumber1 = scanner.nextInt();

        System.out.print("Please enter second number: ");
        inputNumber2 = scanner.nextInt();

        System.out.print("Please enter third number: ");
        inputNumber3 = scanner.nextInt();

        System.out.print("Please enter fourth number: ");
        inputNumber4 = scanner.nextInt();

        System.out.print("Please enter fifth number: ");
        inputNumber5 = scanner.nextInt();

        int sum = inputNumber1 + inputNumber2 + inputNumber3 + inputNumber4 + inputNumber5;

        System.out.println("Sum is: " + sum);
        System.out.println("Average is: "+ (sum / 5));
    }
}
