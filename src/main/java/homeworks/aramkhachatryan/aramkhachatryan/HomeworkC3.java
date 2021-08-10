// Write a program to print Fibonacci series of n terms, where n is input by user.

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkC3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of Fibonacci turns: ");
        int turns = input.nextInt();
        int fib = 2;
        int prev2 = fib - 2;
        int prev1 = fib - 1;
        if (turns == 1) {
            System.out.println(0);
        } else if (turns == 2) {
            System.out.println(0);
            System.out.println(1);
        } else {
            System.out.println(0);
            System.out.println(1);
            for (int i = 0; i <= turns-3; i++) {
                fib = prev1 + prev2;
                System.out.println(fib);
                prev2 = prev1;
                prev1 = fib;
            }
        }
    }
}
