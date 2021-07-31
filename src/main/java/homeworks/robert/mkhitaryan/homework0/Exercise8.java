package homeworks.robert.mkhitaryan.homework0;

import java.util.Scanner;

public class Exercise8 {
//  Take two numbers from input. Swap them and print out.
    public static void main(String[] args) {
        System.out.println("Exercise 8");
        System.out.println("Take two numbers from input. Swap them and print out.");
        System.out.println("-----------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the value of X: ");
        int x = input.nextInt();
        System.out.print("Please Enter the value of Y: ");
        int y = input.nextInt();
        System.out.println("\nOutput: \n\tBefore swapping X = " + x + ", Y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("\tAfter swapping X = " + x + ", Y = " + y);
    }
}
