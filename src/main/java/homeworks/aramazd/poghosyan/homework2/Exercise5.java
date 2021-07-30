package homeworks.aramazd.poghosyan.homework2;

/*
*    Take a year from input. Output whether that year is a leap year or not.
*    Test Data: 2016 Expected Output: true
*/

import java.util.Scanner;

public class Exercise5 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year to check is ti leap year: ");
        int year = scanner.nextInt();
        boolean isTrue = (year % 4 == 0) && ((year % 100 != 0) || (year % 100 == 0) && (year % 400 == 0));

        System.out.println(isTrue);

    }
}
