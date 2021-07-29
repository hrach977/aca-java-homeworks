package solution;

import java.util.Scanner;

public class Exercise2b {
    // Take 2 numbers from input. Print the result of their division.
    // b)The input contains floating point numbers

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number");
        float one = input.nextFloat();
        System.out.println("Input second number");
        float two = input.nextFloat();
        float result = one/two;
        System.out.println("Result is " + result);



    }
}
