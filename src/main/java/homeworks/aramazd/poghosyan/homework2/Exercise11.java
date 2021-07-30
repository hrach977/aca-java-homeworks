package homeworks.aramazd.poghosyan.homework2;

/*
*   Solve exercise 10 using switch statement.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month and year: ");
        String data = scanner.nextLine();
        String month = data.substring(0, data.indexOf(',')).toLowerCase(Locale.ROOT);
        int year = Integer.parseInt(data.substring(data.indexOf(' ') + 1));
        boolean isTrue = (year % 4 == 0) && ((year % 100 != 0) || (year % 100 == 0) && (year % 400 == 0));

        switch (month) {
            case "july" :
                System.out.println("31");
                break;
            case "february":
                System.out.println(isTrue ? "29": "28");
                break;
            case "march":
                System.out.println("31");
                break;
            case "april":
                System.out.println("30");
                break;
            case "may":
                System.out.println("31");
                break;
            case "june":
                System.out.println("30");
                break;
            case "jule":
                System.out.println("31");
                break;
            case "august":
                System.out.println("31");
                break;
            case "september":
                System.out.println("30");
                break;
            case "october":
                System.out.println("31");
                break;
            case "november":
                System.out.println("30");
                break;
            case "desember":
                System.out.println("31");
                break;
            default:
                System.out.println("You enter wrong month!");
        }

    }
}
