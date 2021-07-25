package homeworks.robert.mkhitaryan;

import java.util.Scanner;

public class Exercise3 {
//  Take a number from input. Print its multiplication table up to 10
    public static void main(String[] args) {
        System.out.println("Exercise 3");
        System.out.println("Take a number from input. Print its multiplication table up to 10");
        System.out.println("-----------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        byte number = input.nextByte();
        System.out.println("Output:");
        System.out.println("\t\t" + number + " * " + "1 = " + number
                         + "\n\t\t" + number + " * " + "2 = " + number * 2
                         + "\n\t\t" + number + " * " + "3 = " + number * 3
                         + "\n\t\t" + number + " * " + "4 = " + number * 4
                         + "\n\t\t" + number + " * " + "5 = " + number * 5
                         + "\n\t\t" + number + " * " + "6 = " + number * 6
                         + "\n\t\t" + number + " * " + "7 = " + number * 7
                         + "\n\t\t" + number + " * " + "8 = " + number * 8
                         + "\n\t\t" + number + " * " + "9 = " + number * 9
                         + "\n\t\t" + number + " * " + "10 = " + number * 10
        );
    }
}
