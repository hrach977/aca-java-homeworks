package homeworks.robert.mkhitaryan.homework0;

import java.util.Scanner;

public class Exercise7 {
//  Take 5 numbers from input. Output their sum and average.
    public static void main(String[] args) {
        System.out.println("Exercise 7");
        System.out.println("Take 5 numbers from input. Output their sum and average.");
        System.out.println("-----------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter first number: ");
        int firsNumber = input.nextInt();
        System.out.print("Please Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Please Enter third number: ");
        int thirdNumber = input.nextInt();
        System.out.print("Please Enter fourth number: ");
        int fourthNumber = input.nextInt();
        System.out.print("Please Enter fifth number: ");
        int fifthNumber = input.nextInt();

        System.out.println("Output:\n\t\tSum is: " + (firsNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber));
        System.out.println("\t\tAverage is: " + (float) (firsNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber) / 5);
    }
}
