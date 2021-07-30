package homeworks.aramazd.poghosyan.homework1;

import java.util.Scanner;

/*
*   Take a number in inches from input.
*   Convert it to meters and print out.
*   Test Data:1000
*       Expected Output: 1000.0 inches is 25.4 meters.
 */
public class Exercise6 {
    public static void main(String[] args) {
        float inputNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number: ");
        inputNumber = scanner.nextInt();

        System.out.println(inputNumber + " inches is " + (inputNumber * 0.0254) + " meters.");
    }
}
