import java.util.Scanner;

public class Homework1_1 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        System.out.print("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        firstNumber = input.nextInt();
        System.out.print("Please enter second number: ");
        secondNumber = input.nextInt();
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
    }
}