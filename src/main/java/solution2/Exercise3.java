package solution2;

import java.util.Scanner;

public class Exercise3 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        double first = input.nextDouble();
        System.out.println("Please enter second number");
        double second = input.nextDouble();

        first = Math.floor(first * 1000);
        first/=1000;
        second = Math.floor(second * 1000);
        second/=1000;

        if (first == second){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

    }
}
