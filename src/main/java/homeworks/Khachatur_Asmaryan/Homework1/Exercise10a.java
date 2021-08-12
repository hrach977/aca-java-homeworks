package homeworks.Khachatur_Asmaryan.Homework1;

import java.util.Scanner;

public class Exercise10a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter month");
        String month = input.nextLine();
        System.out.println("enter year");
        int year = input.nextInt();
        month = month.toLowerCase();
        switch (month) {

            case "january":
                System.out.println("31");
                break;
            case "february": {
                boolean first = (year % 4 == 0) && (year % 100 != 0);
                boolean second = year % 400 == 0;
                if (first || second) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            }
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
            case "july":
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
            case "december":
                System.out.println("31");
                break;
        }
    }
}
