package homeworks.Khachatur_Asmaryan;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        float inches;
        float meter;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of inches");
        inches = input.nextFloat();
        meter = (float) (inches/(39.3700787));
        System.out.println(inches + " inches is " + meter + " meters");

    }
}
