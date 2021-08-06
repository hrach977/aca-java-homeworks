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
        boolean leap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        if (leap && (month == "February")) {
            System.out.print("29");
        } else if (month == "February") {
            System.out.print("28");
        } else if (month == "January" || month == "March" || month == "May" || month == "July" || month == "August" || month == "October" || month == "December") {
            System.out.print("31");
        } else if (month == "April" || month == "June" || month == "September" || month == "November") {
            System.out.print("30");
        } else {
            System.out.print("It's not a correct name of month");
        }
    }
}