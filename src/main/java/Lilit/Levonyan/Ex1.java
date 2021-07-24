package Lilit.Levonyan;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner input = new Scanner(System.in);
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
    }
}
