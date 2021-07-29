package homeworks.Khachatur_Asmaryan;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        number = input.nextInt();
        System.out.println("Take a number from input. Print its multiplication table up to 10");
        System.out.println( number + " * " + "1 = " + number);
        System.out.println( number + " * " + "2 = " + number * 2);
        System.out.println( number + " * " + "3 = " + number * 3);
        System.out.println( number + " * " + "4 = " + number * 4);
        System.out.println( number + " * " + "5 = " + number * 5);
        System.out.println( number + " * " + "6 = " + number * 6);
        System.out.println( number + " * " + "7 = " + number * 7);
        System.out.println( number + " * " + "8 = " + number * 8);
        System.out.println( number + " * " + "9 = " + number * 9);
        System.out.println( number + " * " + "10 = " + number * 10);


    }
}
