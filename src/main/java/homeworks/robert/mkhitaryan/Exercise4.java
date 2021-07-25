package homeworks.robert.mkhitaryan;

import java.util.Scanner;

public class Exercise4 {
//  Take a number from input, which will represent the side of a square.
//  Print the perimeter and the area of the square.
    public static void main(String[] args) {
        System.out.println("Exercise 4");
        System.out.println("Take a number from input, which will represent the side of a square.");
        System.out.println("Print the perimeter and the area of the square.");
        System.out.println("-----------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        short number = input.nextShort();
        System.out.println("Output:");
        System.out.println("\t\tThe perimeter of the square is " + number * 4 + ".");
        System.out.println("\t\tThe area of the square is " + number * number + ".");
    }
}
