package homeworks.tinasargsyan.hw1exercises;
import java.util.Scanner;
/*
Take a number from input, which represents the temperature in Fahrenheit scale.
Convert it into Celsius and output the degree.
 */


public class ExerciseFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        System.out.println("Please enter the temperature in Fahrenheit scale ");
        fahrenheit = input.nextDouble();
        celsius  = ((fahrenheit-32)*5)/9;
        System.out.println("Temperature in celsius is >>" + celsius);
    }
}
