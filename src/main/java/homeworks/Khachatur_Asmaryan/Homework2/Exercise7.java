package homeworks.Khachatur_Asmaryan.Homework2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number ");
        num1 = input.nextInt();
        System.out.println("Please enter the second number ");
        num2 = input.nextInt();
        if ( num1 == 10 || num2 == 10 || ( num1 + num2 ) == 10 ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
