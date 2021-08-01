package homeworks.Khachatur_Asmaryan.Homework2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int num1;
        int num2;
        boolean number;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number ");
        num1 = input.nextInt();
        System.out.println("Please enter the second number ");
        num2 = input.nextInt();
        if (num1 > 25 && num2 < 75 ) {
            number = true;
            System.out.println(number);
        } else {
            number = false;
            System.out.println(number);
        }
    }
}
