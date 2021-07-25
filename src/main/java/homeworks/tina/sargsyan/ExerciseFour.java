package homeworks.tina.sargsyan;
import java.util.Scanner;
/*
Take a number from input, which will represent the side of a square.
Print the perimeter and the area of the square.
 */


public class ExerciseFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side;
        int perimeter;
        int area;
        System.out.println("Enter Side Length of Square ");
        side = input.nextInt();
        area = side*side;
        perimeter = 4*side;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

}
