package solution;

import java.util.Scanner;

public class Exercise6 {
    //Take a number in inches from input. Convert it to meters and print out.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number in inches");
        double inches = input.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(" Result is " + meters);



    }
}
