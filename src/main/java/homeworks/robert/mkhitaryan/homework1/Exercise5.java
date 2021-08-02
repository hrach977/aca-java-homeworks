package homeworks.robert.mkhitaryan.homework1;

import java.util.Scanner;

public class Exercise5 {
//    Take a year from input. Output whether that year is a leap year or not.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        short year = input.nextShort();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " isn't a leap year");
        }
    }
}
