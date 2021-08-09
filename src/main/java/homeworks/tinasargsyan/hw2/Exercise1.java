package homeworks.tinasargsyan.hw2;
/*
Write a program to read the numbers from input till the user wants
(user will choose to continue via y/n answers)
and at the end the program should display the largest
and smallest numbers entered.
 */
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char answer = ' ';

        do{
            System.out.println("Enter the number ");
            number = sc.nextInt();

            if(number > max) {
                max = number;
            }

            if(number < min) {
                min = number;
            }

            System.out.println("Do you want to continue y/n? ");
            answer = sc.next().charAt(0);

        }while(answer=='y' || answer == 'Y');

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }
}
