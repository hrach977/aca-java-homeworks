package aramkhachatryan;

import java.util.Scanner;

public class HomeworkA5 {
    public static void main(String[] args) {
        float numberF;
        System.out.print("Please enter the temperature in Fahrenheit scale: ");
        Scanner input = new Scanner(System.in);
        numberF = input.nextFloat();
        float numberC = (numberF - 32) * 5 / 9;
        System.out.println(numberF + " degree in Fahrenheit is equal to " + numberC + " in Celsius.");
    }
}