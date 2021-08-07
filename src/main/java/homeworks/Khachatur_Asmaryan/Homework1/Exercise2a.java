package homeworks.Khachatur_Asmaryan.Homework1;

import java.util.Scanner;

public class Exercise2a {
    public static void main(String[] args) {
        int firstnumber;
        int secondnumber;
        int division;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first integer number ");
        firstnumber = input.nextInt();
        System.out.println("Please enter the second integer number ");
        secondnumber = input.nextInt();
        division = firstnumber/secondnumber;
        System.out.println("the division of " + firstnumber + " and " + secondnumber + " is " + division );


    }
}
