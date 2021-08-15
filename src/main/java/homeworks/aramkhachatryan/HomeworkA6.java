package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkA6 {
    public static void main(String[] args) {
        float numberI;
        System.out.print("Please enter a number in inches: ");
        Scanner input = new Scanner(System.in);
        numberI = input.nextFloat();
        float numberC = (float) (numberI / 39.37007874015748);
        System.out.println(numberI + " inches is " + numberC + " meters.");
    }
}