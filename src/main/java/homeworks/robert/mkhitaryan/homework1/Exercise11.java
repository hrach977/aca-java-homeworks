package homeworks.robert.mkhitaryan.homework1;

import java.util.Scanner;

public class Exercise11 {
    //    Solve exercise 10 using switch statement.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the month: ");
        String month = input.next();
        System.out.print("Please enter the year: ");
        short year = input.nextShort();

        switch (month) {
            case "April", "June", "September", "November" -> System.out.println("The month have 30 days.");
            case "February" -> {
                boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
                if (!isLeapYear) {
                    System.out.println("The month have 28 days.");
                } else {
                    System.out.println("The month have 29 days.");
                }
            }
            default -> System.out.println("The month have 31 days.");
        }
    }
}
