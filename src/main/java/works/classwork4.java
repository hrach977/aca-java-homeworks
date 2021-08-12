package works;

import java.util.Scanner;

public class classwork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number");
        int num2 = input.nextInt();
        System.out.println("Please enter the third number");
        int num3 = input.nextInt();

        System.out.println("The greatest number is" + Math.max(num1, Math.max(num2, num3)));

    }
}

