package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkA7 {
    public static void main(String[] args) {
        int numberA;
        int numberB;
        int numberC;
        int numberD;
        int numberE;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");
        System.out.print("A: ");
        numberA = input.nextInt();
        System.out.print("B: ");
        numberB = input.nextInt();
        System.out.print("C: ");
        numberC = input.nextInt();
        System.out.print("D: ");
        numberD = input.nextInt();
        System.out.print("E: ");
        numberE = input.nextInt();
        int sum = numberA + numberB + numberC + numberD + numberE;
        float sumF = numberA + numberB + numberC + numberD + numberE;
        float average = sumF / 5;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
    }
}