package homeworks.tina.sargsyan;
import java.util.Scanner;
/*
Take a number in inches from input.
Convert it to meters and print out.
 */


public class ExerciseSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inches;
        double meters;
        System.out.println("Please enter the inches to convert ");
        inches = input.nextDouble();
        meters = inches * 0.0254;
        System.out.println(inches + " inch is " + meters + " meters");
    }
}
