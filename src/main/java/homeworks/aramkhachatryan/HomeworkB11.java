//  Take a string from input representing a month and a number representing the year. Output the number of days in that month.
//  Test Data: February, 2016
//  Expected Output: 29

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkB11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a month and a year.");
        System.out.print("Month (word): ");
        String month = input.next();
        System.out.print("Year (number): ");
        int year = input.nextInt();
        boolean leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                leap = year % 400 == 0;
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if (leap) {
            switch (month) {
                case "January" -> System.out.print("31");
                case "February" -> System.out.print("29");
                case "March" -> System.out.print("31");
                case "April" -> System.out.print("30");
                case "May" -> System.out.print("31");
                case "June" -> System.out.print("30");
                case "July" -> System.out.print("31");
                case "August" -> System.out.print("31");
                case "September" -> System.out.print("30");
                case "October" -> System.out.print("31");
                case "November" -> System.out.print("30");
                case "December" -> System.out.print("31");
                default -> System.out.print("It's not a correct name of month");
            }
        } else {
            switch (month) {
                case "January" -> System.out.print("31");
                case "February" -> System.out.print("28");
                case "March" -> System.out.print("31");
                case "April" -> System.out.print("30");
                case "May" -> System.out.print("31");
                case "June" -> System.out.print("30");
                case "July" -> System.out.print("31");
                case "August" -> System.out.print("31");
                case "September" -> System.out.print("30");
                case "October" -> System.out.print("31");
                case "November" -> System.out.print("30");
                case "December" -> System.out.print("31");
                default -> System.out.print("It's not a correct name of month");
            }
        }
    }
}