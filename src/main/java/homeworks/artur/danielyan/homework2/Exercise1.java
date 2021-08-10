package homeworks.artur.danielyan.homework2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int max;
        int min;
        char choice;

        System.out.println("Please enter the number");
        num = input.nextInt();
        max = num;
        min = num;
        System.out.println("Do you want to continue? (y/n)");
        choice = input.next().charAt(0);

        while(choice == 'y'){
            System.out.println("Please enter the number");
            num = input.nextInt();
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            System.out.println("Do you want to continue? (y/n)");
            choice = input.next().charAt(0);
        }

        System.out.println("The max number is: " + max);
        System.out.println("The min number is: " + min);
    }
}
