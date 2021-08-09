package homeworks.robert.mkhitaryan.homework2;

import java.util.Scanner;

public class Exercise1 {
//    Write a program to read the numbers from input till the user wants (user will choose to continue
//    via y/n answers)and at the end the program should display the largest and smallest numbers
//    entered.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        char answer;
        System.out.print("Please enter a number : ");
        number = input.nextInt();
        int max = number;
        int min = number;
        do {
            System.out.print("Please enter a number : ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            System.out.print("Would you like to continue? (y/n) : ");
            answer = input.next().charAt(0);
        } while (answer == 'y');
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);
     }
}
