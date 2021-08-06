package homeworks.Khachatur_Asmaryan.Homework2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter month");
        String month = input.nextLine();
        System.out.println("enter year");
        int year = input.nextInt();
        month = month.toLowerCase();
        if (month.equals("january")) {
            System.out.println("31");
        }else if (month.equals("february")) {
            boolean first = (year % 4 == 0) && (year % 100 != 0);
            boolean second = year % 400 == 0;
            if (first || second) {
                System.out.println(29);
            }else {
                System.out.println(28);
            }
        } else if (month.equals("march")) {
            System.out.println("31");
        } else if (month.equals("april")) {
            System.out.println("30");
        }else if (month.equals("may")) {
            System.out.println("31");
        }else if (month.equals("june")) {
            System.out.println("30");
        }else if (month.equals("july")) {
            System.out.println("31");
        }else if (month.equals("august")) {
            System.out.println("31");
        }else if (month.equals("september")) {
            System.out.println("30");
        }else if (month.equals("october")) {
            System.out.println("31");
        }else if (month.equals("november")) {
            System.out.println("30");
        }else if (month.equals("december")) {
            System.out.println("31");
        }

    }
}
