import java.util.Scanner;

public class Homework1_4 {
    public static void main(String[] args) {
        int number;
        System.out.print("Please enter size of the side of a square: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int perimeter = number * 4;
        int area = number * number;
        System.out.println("The perimeter of the square is: " + perimeter);
        System.out.println("The area of the square is: " + area);
    }
}