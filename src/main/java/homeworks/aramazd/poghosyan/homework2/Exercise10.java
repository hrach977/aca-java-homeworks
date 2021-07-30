package homeworks.aramazd.poghosyan.homework2;

/*
*   Take a string from input representing a month and a number representing the year.
*   Output the number of days in that month.
*   Test Data: February, 2016
*   Expected Output: 29
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month and year: ");
        String data = scanner.nextLine();
        String month = data.substring(0, data.indexOf(',')).toLowerCase(Locale.ROOT);
        int year = Integer.parseInt(data.substring(data.indexOf(' ') + 1));
        boolean isTrue = (year % 4 == 0) && ((year % 100 != 0) || (year % 100 == 0) && (year % 400 == 0));

        if ((month.equals("january")) || (month.equals("march")) || (month.equals("may")) ||
                (month.equals("july")) || (month.equals("august") ) || (month.equals("october")) ||
                (month.equals("december"))){
            System.out.println(31);
        } else if ((month.equals("april")) || (month.equals("june")) ||
                (month.equals("september")) || (month.equals("november"))) {
            System.out.println(30);
        } else if (month.equals("february")) {
            if (isTrue)
                System.out.println(29);
            else
                System.out.println(28);
        } else
            System.out.println("You enter wrong month!");


    }
}
