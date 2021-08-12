package homeworks.Khachatur_Asmaryan.Homework0;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int side;
        int perimeter;
        int area;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one of the sides of the square");
        side = input.nextInt();
        perimeter = side * 4;
        area = side * side;
        System.out.println("The perimeter is " + perimeter + "\n");
        System.out.println("The area is " + area );
    }
}
