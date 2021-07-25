package homeworks.robert.mkhitaryan;

import java.util.Scanner;

public class Exercise5 {
//  Take a number from input, which represents the temperature in Fahrenheit scale.
//  Convert it into Celsius and output the degree.
    public static void main(String[] args) {
        System.out.println("Exercise 5");
        System.out.println("Take a number from input, which represents the temperature in Fahrenheit scale.");
        System.out.println("Convert it into Celsius and output the degree.");
        System.out.println("-----------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        short number = input.nextShort();
        System.out.println("Output: " + (float) number + " degree in Fahrenheit is equal to "
                                      + (float) ((number - 32) * 5) / 9 + " in Celsius.");
    }
}
