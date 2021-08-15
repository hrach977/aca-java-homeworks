package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkA3a {
    public static void main(String[] args) {
        int number;
        int x = 1;
        System.out.print("Please enter an integer number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        while (x < 11) {
            System.out.println(number + " * " + x + " = " + (number * x));
            x = x + 1;
        }
    }
}