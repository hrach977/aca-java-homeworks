package homeworks.Khachatur_Asmaryan;

import java.util.Scanner;

public class Exercise2b {
    public static void main(String[] args) {
        double firstnumber;
        double secondnumber;
        double division;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first double number ");
        firstnumber =  input.nextDouble();
        System.out.println("Please enter the second double number ");
        secondnumber = input.nextDouble();
        division = firstnumber/secondnumber;
        System.out.println("the division of " + firstnumber + " and " + secondnumber + " is " + division );
    }
}
