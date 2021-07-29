package solution;

import java.util.Scanner;

public class Exercise7 {
    //Take 5 numbers from input. Output their sum and average.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        int four = input.nextInt();
        int five = input.nextInt();
        int sum = one + two + three + four + five;
        int average = sum / 5;
        System.out.println("Sum is" + sum);
        System.out.println("Average is" + average);
    }
}
