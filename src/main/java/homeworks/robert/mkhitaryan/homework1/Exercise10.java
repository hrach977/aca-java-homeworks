package homeworks.robert.mkhitaryan.homework1;

import java.util.Scanner;

public class Exercise10 {
//    Take a string from input representing a month and a number representing the year. Output the number of days in that month.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the month: ");
        String month = input.next();
        System.out.print("\nPlease enter the year: ");
        short year = input.nextShort();
        boolean isMonthHaveThirtyDays = ((month.equals("April")) || (month.equals("June")) ||
                                        (month.equals("September")) || (month.equals("November")));
        if (isMonthHaveThirtyDays) {
            System.out.println("The month have 30 days.");
        } else if (month.equals("February")) {
            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
            if(!isLeapYear) {
                System.out.println("The month have 28 days.");
            } else {
                System.out.println("The month have 29 days.");
            }
        } else {
            System.out.println("The month have 31 days.");
        }
    }
}
