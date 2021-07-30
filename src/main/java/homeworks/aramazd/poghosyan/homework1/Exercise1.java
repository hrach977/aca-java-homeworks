package homeworks.aramazd.poghosyan.homework1;

import java.util.Scanner;

/*
*  Take 2 numbers from input.
* Print their product.
* Test Data: 10, 2
* Expected Output: 10 * 2 = 20
*
*/
public class Exercise1 {

    public static void main(String[] srgs) {

        int inputNumber1;
        int inputNumber2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        inputNumber1 = scanner.nextInt();

        System.out.print("Please enter second number: ");
        inputNumber2 = scanner.nextInt();

        System.out.println(inputNumber1 + " * " + inputNumber2 + " = " + (inputNumber1 * inputNumber2));

    }

}
