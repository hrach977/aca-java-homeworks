package homeworks.tinasargsyan.hw1condition;
/*
Take a string from input representing a month
and a number representing the year.
Output the number of days in that month.
Solve using switch statement.
 */
import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month");
        String monthName = input.nextLine();
        System.out.println("Enter the year");
        int year = input.nextInt();
        monthName = monthName.toLowerCase();

        switch (monthName) {
            case "january":
                System.out.println(31);
               break;
                case "february":
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        System.out.println(29);
                        }else {
                        System.out.println(28);
                        }
                        break;
                    case "march":
                        System.out.println(31);
                        break;
                    case "april":
                        System.out.println(30);
                        break;
                    case "may":
                        System.out.println(31);
                        break;
                    case "june":
                        System.out.println(30);
                        break;
                    case "july":
                        System.out.println(31);
                        break;
                    case "august":
                        System.out.println(31);
                        break;
                    case "september":
                        System.out.println(30);
                        break;
                    case "october":
                        System.out.println(31);
                        break;
                    case "november":
                        System.out.println(30);
                        break;
                    case "december":
                        System.out.println(31);
                }
    }
}
