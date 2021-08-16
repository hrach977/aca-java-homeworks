package Lilit.Levonyan;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int side;
        int area;
        int perimeter;
        Scanner input = new Scanner(System.in);
        side = input.nextInt();
        area = side * side;
        perimeter = 4 * side;
        System.out.println("The area of the square is " + area);
        System.out.println("The perimeter of the square is " + perimeter);

    }
}
