package aramkhachatryan;

import java.util.Scanner;

public class HomeworkA2a {
    public static void main(String[] args) {
        float firstNumber;
        float secondNumber;
        System.out.print("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        firstNumber = input.nextFloat();
        System.out.print("Please enter second number: ");
        secondNumber = input.nextFloat();
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    }
}