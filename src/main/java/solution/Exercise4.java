package solution;
import java.util.Scanner;

public class Exercise4 {
    /*Take a number from input, which will represent the side of a square.
    Print the perimeter and the area of the square*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        int perimeter = side * 4;
        int area = side * side;
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
}
