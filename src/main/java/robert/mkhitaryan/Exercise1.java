package robert.mkhitaryan;

import java.util.Scanner;

public class Exercise1 {
//    Take 2 numbers from input. Print their product.
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        System.out.println("Take 2 numbers from input. Print their product.");
        System.out.println("-----------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter first number: ");
        byte firsNumber = input.nextByte();
        System.out.print("Please Enter second number: ");
        byte secondNumber = input.nextByte();
        System.out.println("\nOutput: " + firsNumber + " * " + secondNumber + " = " + firsNumber * secondNumber);
    }
}
