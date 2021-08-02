package homeworks.robert.mkhitaryan.homework1;

import java.util.Scanner;

public class Exercise1 {
//    Take a number from input between 1-7. Output the corresponding day of week.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number from 1 to 7: ");
        byte day = input.nextByte();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day range");
        }
    }
}
