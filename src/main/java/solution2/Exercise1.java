package solution2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number of day");
        int number = input.nextInt();
        String dayOfWeek;
        if (number == 1) {
            dayOfWeek = "Monday";
        } else if (number == 2) {
            dayOfWeek = "Tuesday";
        } else if (number == 3) {
            dayOfWeek = "Wednesday";
        } else if (number == 4) {
            dayOfWeek = "Thursday";
        } else if (number == 5) {
            dayOfWeek = "Friday";
        } else if (number == 6) {
            dayOfWeek = "Saturday";
        } else if (number == 7) {
            dayOfWeek = "Sunday";
        } else {
            dayOfWeek = "Wrong day range";
        }

        System.out.println(dayOfWeek);

        }


    }





