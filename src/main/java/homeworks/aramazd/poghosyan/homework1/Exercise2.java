package homeworks.aramazd.poghosyan.homework1;

/*
*   Take 2 numbers from input.
*   Print the result of their division.
*
*   a)The input contains integers
*   b)The inputcontains floating point numbers
*
*   Test Data: 50, 3
*
*   a)Expected Output: 50 / 3 = 16
*   b)Expected Output: 50 / 3 = 16.6666667
*/

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        int inputNumber1;
        int inputNumber2;
        int intAnswer;
        float floatAnswer;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        inputNumber1 = scanner.nextInt();

        System.out.print("Please enter second number: ");
        inputNumber2 = scanner.nextInt();

        intAnswer = inputNumber1 / inputNumber2;
        floatAnswer = (float) inputNumber1 / (float) inputNumber2;

        System.out.println(inputNumber1 + " / " + inputNumber2 + " = (Integer) " + intAnswer);
        System.out.println(inputNumber1 + " / " + inputNumber2 + " = (float) " + floatAnswer);

    }

}
