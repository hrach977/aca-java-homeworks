package homeworks.robert.mkhitaryan.homework2;

import java.util.Scanner;

public class Exercise4 {
//    Write a program to calculate the sum of the following series, where n is input by user:
//    1 +½+ 1/3 + ¼+ 1/5 + 1/6 + .... + 1/n
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the n : ");
        int n = input.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1/ (double) i;
        }
        System.out.println("Sum is : " + sum);
    }
}
