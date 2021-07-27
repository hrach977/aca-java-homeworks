package homeworks.aramazd.poghosyan;

import java.util.Scanner;

/*
*   Take a number from input,
*   which will represent the side of a square.
*   Print the perimeter and the area of the square.
*   Test Data: 5
*
*   Expected Output:
*       The perimeter of the square is 20.
*       The area of the square is 25.
 */
public class Exercise4 {
    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number: ");
        inputNumber = scanner.nextInt();

        System.out.println("The perimeter of the square is: " + (inputNumber * 4));
        System.out.println("The area of the square is: " + (inputNumber * inputNumber));
    }
}
