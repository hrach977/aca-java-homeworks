package homeworks.robert.mkhitaryan.homework0;

import java.util.Scanner;

public class Exercise2 {
//  Take 2 numbers from input. Print the result of their division.
//      a) The input contains integers
//      b) The input contains floating point numbers
    public static void main(String[] args) {
        System.out.println("Exercise 2");
        System.out.println("Take 2 numbers from input. Print the result of their division.");
        System.out.println("\ta) The input contains integers");
        System.out.println("\tb) The input contains floating point numbers");
        System.out.println("-----------------------------------------------\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter first integer number: ");
        int firsNumberInt = input.nextInt();
        System.out.print("Please Enter second integer number: ");
        int secondNumberInt = input.nextInt();

        System.out.print("Please Enter first floating point number: ");
        float firsNumberFloat = input.nextFloat();
        System.out.print("Please Enter second floating point number: ");
        float secondNumberFloat = input.nextFloat();

        System.out.println("\na) Output: " + firsNumberInt + " / " + secondNumberInt + " = " + firsNumberInt / secondNumberInt);
        System.out.println("b) Output: " + firsNumberFloat + " / " + secondNumberFloat + " = " + firsNumberFloat / secondNumberFloat);
    }
}
