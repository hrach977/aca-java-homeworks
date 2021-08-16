package Lilit.Levonyan;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();
        System.out.println("Sum is: " + (num1 + num2 + num3 + num4 + num5));
        System.out.println("Average is: " + (float) (num1 + num2 + num3 + num4 + num5) / 5);
    }
}
