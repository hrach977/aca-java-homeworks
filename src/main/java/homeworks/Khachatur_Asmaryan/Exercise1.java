package homeworks.Khachatur_Asmaryan;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int firstnumber;
        int secondnumber;
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number ");
        firstnumber = input.nextInt();
        System.out.println("Pleas enter the second number ");
        secondnumber = input.nextInt();
        sum = firstnumber * secondnumber;
        System.out.println("The sum of " + firstnumber + " and " + secondnumber + " is " + sum);
    }
}
