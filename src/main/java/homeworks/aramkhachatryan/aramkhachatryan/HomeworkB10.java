//  Take a string from input representing a month and a number representing the year. Output the number of days in that month.
//  Test Data: February, 2016
//  Expected Output: 29

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkB10 {
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
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if (leap) {
            if ("January".equals(month)) {
                System.out.print("31");
            } else if ("February".equals(month)) {
                System.out.print("29");
            } else if ("March".equals(month)) {
                System.out.print("31");
            } else if ("April".equals(month)) {
                System.out.print("30");
            } else if ("May".equals(month)) {
                System.out.print("31");
            } else if ("June".equals(month)) {
                System.out.print("30");
            } else if ("July".equals(month)) {
                System.out.print("31");
            } else if ("August".equals(month)) {
                System.out.print("31");
            } else if ("September".equals(month)) {
                System.out.print("30");
            } else if ("October".equals(month)) {
                System.out.print("31");
            } else if ("November".equals(month)) {
                System.out.print("30");
            } else if ("December".equals(month)) {
                System.out.print("31");
            } else {
                System.out.print("It's not a correct name of month");
            }
        } else {
            if ("January".equals(month)) {
                System.out.print("31");
            } else if ("February".equals(month)) {
                System.out.print("28");
            } else if ("March".equals(month)) {
                System.out.print("31");
            } else if ("April".equals(month)) {
                System.out.print("30");
            } else if ("May".equals(month)) {
                System.out.print("31");
            } else if ("June".equals(month)) {
                System.out.print("30");
            } else if ("July".equals(month)) {
                System.out.print("31");
            } else if ("August".equals(month)) {
                System.out.print("31");
            } else if ("September".equals(month)) {
                System.out.print("30");
            } else if ("October".equals(month)) {
                System.out.print("31");
            } else if ("November".equals(month)) {
                System.out.print("30");
            } else if ("December".equals(month)) {
                System.out.print("31");
            } else {
                System.out.print("It's not a correct name of month");
            }
        }
    }
}