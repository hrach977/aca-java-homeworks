package homeworks.robert.mkhitaryan.homework1;

import java.util.Scanner;

public class Exercise7 {
//    Take two numbers from input. Output true if one of them is 10 or if their sum is 10.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = input.nextInt();
        if ((firstNumber == 10) || (secondNumber == 10) || (firstNumber + secondNumber) == 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
