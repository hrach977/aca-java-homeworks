package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkA2b {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        System.out.print("Please enter first integer number: ");
        Scanner input = new Scanner(System.in);
        firstNumber = input.nextInt();
        System.out.print("Please enter second integer number: ");
        secondNumber = input.nextInt();
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    }
}
