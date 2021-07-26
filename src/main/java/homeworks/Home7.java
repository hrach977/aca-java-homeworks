package homeworks;

import java.util.Scanner;

public class Home7 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 5 numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        num5 = scanner.nextInt();
        int m = num1 + num2 + num3 + num4 + num5;
        double n = num1 + num2 + num3 + num4 + num5;
        System.out.println("Sum is " + m);
        System.out.println("Average is " + n / 5);


    }
}
