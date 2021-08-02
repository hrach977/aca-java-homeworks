package homeworks.robert.mkhitaryan.homework1;

import java.util.Scanner;

public class Exercise6 {
//    Take two integers from input between 25 and 75. Output true if there’s a common digit in both numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first integer between 25 and 75: ");
        int firstInteger = input.nextInt();
        System.out.print("Please enter the second integer between 25 and 75: ");
        int secondInteger = input.nextInt();
        int firsDigitOfFirstInteger = firstInteger / 10;
        int secondDigitOfFirstInteger = firstInteger % 10;
        int firsDigitOfSecondInteger = secondInteger / 10;
        int secondDigitOfSecondInteger = secondInteger % 10;
        boolean isThereCommonDigitInBoth = ((firsDigitOfFirstInteger == firsDigitOfSecondInteger) ||
                                            (firsDigitOfFirstInteger == secondDigitOfSecondInteger) ||
                                            (secondDigitOfFirstInteger == firsDigitOfSecondInteger) ||
                                            (secondDigitOfFirstInteger == secondDigitOfSecondInteger)
                                            );
        if (isThereCommonDigitInBoth) {
            System.out.println("There is a common digit in both numbers.");
        } else {
            System.out.println("There isn't a common digit in both numbers.");
        }
    }
}
