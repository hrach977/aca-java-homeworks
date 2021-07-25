package homeworks.robert.mkhitaryan;

import java.util.Scanner;

public class Exercise6 {
//  Take a number in inches from input. Convert it to meters and print out.
    public static void main(String[] args) {
        System.out.println("Exercise 6");
        System.out.println("Take a number in inches from input. Convert it to meters and print out.");
        System.out.println("-----------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        int number = input.nextInt();
        System.out.println("Output: " + (double) number + " inches is " + (double) number * 0.0254 + " meters.");
    }
}
