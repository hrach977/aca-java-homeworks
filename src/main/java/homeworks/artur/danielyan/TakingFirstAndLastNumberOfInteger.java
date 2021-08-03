package homeworks.artur.danielyan;

import java.util.Scanner;

public class TakingFirstAndLastNumberOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers between 25 an 75");
        int a = input.nextInt();
        int b = input.nextInt();

        int a1 = a / 10; // takes the first number of a
        int a2 = a % 10; // takes the last number of a
        int b1 = b / 10;
        int b2 = b % 10;
        if((a>=25 && a<=75) && (b>=25 && b<=75)){
            System.out.println((a1 == b1) || (a1 == b2) || (a2 == b1) || (a2 == b2));
        }else{
            System.out.println("Entered number(s) isn't in the required range");
        }
    }
}
