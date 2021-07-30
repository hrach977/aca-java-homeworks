package homeworks.aramazd.poghosyan.homework1;

/*
*   Take a number from input, which represents the temperature in
*   Fahrenheitscale.Convert it into Celsius and outputthe degree.
*   Test Data: 212
*   Expected Output:
*       212.0 degree in Fahrenheit is equal to 100.0 in Celsius.
 */

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        float inputNumber;
        Scanner scanner = new Scanner(System.in);
        float celsius;

        System.out.print("Please enter number: ");
        inputNumber = scanner.nextInt();

        celsius = (inputNumber - 32) * 5 / 9;

        System.out.println(inputNumber + " degree in Fahrenheit is equal to " + celsius + " in Celsius.");

    }

}
