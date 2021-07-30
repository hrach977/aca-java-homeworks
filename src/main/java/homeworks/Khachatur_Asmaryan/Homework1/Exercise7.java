package homeworks.Khachatur_Asmaryan.Homework1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int sum;
        float average;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number" );
        num1 = input.nextInt();
        System.out.print("Please enter second number ");
        num2 = input.nextInt();
        System.out.print("Please enter thrid number ");
        num3 = input.nextInt();
        System.out.print("Please enter fourth number ");
        num4 = input.nextInt();
        System.out.print("Please enter fifth number ");
        num5 = input.nextInt();
        sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("The sum is " + sum);
        average = (num1 + num2 + num3 + num4 + num5)/(sum/3);
        System.out.println("The average is " + average);


    }
}
