package homeworks.aramazd.poghosyan.homework2;

/*
*   Take two floating point numbers from input. Check whether they are the same up to three decimal places.
*   Test Data: 12.1245, 12.1235 Expected Output: They are different
*   Test Data: 12.1245, 121247 Expected Output: They are the same up to three decimal places
*
*/

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first floating number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second floating number: ");
        double num2 = scanner.nextDouble();


        if (Math.round(num1 * 1000) == num2 || Math.round(num2 * 1000) == num1)
            System.out.println("They are the same up to three decimal places.");
        else
            System.out.println("They are different.");



    }
}
