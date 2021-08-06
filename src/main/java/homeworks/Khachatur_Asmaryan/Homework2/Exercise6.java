package homeworks.Khachatur_Asmaryan.Homework2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number ");
        num1 = input.nextInt();
        System.out.println("Please enter the second number ");
        num2 = input.nextInt();

        int a = num1 / 10;
        int b = num1 % 10;
        int c = num2 / 10;
        int d = num2 % 10;

        if ( (num1 >= 25 && num2 <= 75 ) && (num2 >= 25 && num2 <= 75) ) {
            if (a == c || a == d || b == c || b == d){
                System.out.println("there is common digit");
            }else {
                System.out.println("there is no common digit");
            }
        } else {
            System.out.println("out of range");
        }
    }
}
