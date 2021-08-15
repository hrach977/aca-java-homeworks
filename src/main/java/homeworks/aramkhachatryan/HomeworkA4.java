package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkA4 {
    public static void main(String[] args) {
        int number;
        System.out.print("Please enter size of the side of a square: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int perimeter = number * 4;
        double area = number * number;
        System.out.println("The perimeter of the square is: " + perimeter);
        System.out.println("The area of the square is: " + area);
    }
}