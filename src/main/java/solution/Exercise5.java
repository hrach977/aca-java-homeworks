package solution;

import java.util.Scanner;

public class Exercise5 {
    // Take a number from input, which represents the temperature in Fahrenheit scale.
    // Convert it into Celsius and output the degree.

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input temperature");
        float F = input.nextFloat();
        float C = (F - 32) * 5 / 9 ;
        System.out.println( F + " degree Fahrenheit is equal to " + C + " in Celsius " );


    }
}
