package homeworks.robert.mkhitaryan.homework2;

import java.util.Scanner;

public class Exercise3 {
//    Write a program to print Fibonacci series of n terms, where n is input by user.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the n : ");
        int n = input.nextInt();
        if (n == 0) {
            System.out.print("Fibonacci series is : 0");
        } else if (n == 1) {
            System.out.print("Fibonacci series is : 0 1");
        } else {
            int previousOfPrevious = 0;
            int previous = 1;
            int fib;
            System.out.print("Fibonacci series is : 0 1 ");
            for (int i = 2; i <= n; i++) {
                fib = previousOfPrevious + previous;
                System.out.print(fib + " ");
                previousOfPrevious = previous;
                previous = fib;
            }
        }
    }
}
