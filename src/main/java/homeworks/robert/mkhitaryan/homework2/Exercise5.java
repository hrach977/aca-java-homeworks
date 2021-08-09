package homeworks.robert.mkhitaryan.homework2;

import java.util.Scanner;

public class Exercise5 {
//    Compute the natural logarithm of 2, by adding up to n terms in the series:
//    1 –½+ 1/3 –¼+ 1/5 -...1/n  ,where n is a positive integer input by user.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the n: ");
        int n = input.nextInt();
        double ln2 = 0;
        int sign = 1;
        for (int i = 1; i <= n; i++) {
            ln2 += sign / (double) i;
            sign *= -1;
        }
        System.out.println("Natural logarithm of 2 is: " +  ln2);
    }
}
