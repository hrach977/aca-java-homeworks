package homeworks.Khachatur_Asmaryan.Homework2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int year;
        boolean leap;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year ");
        year = input.nextInt();
        if ( year % 4 == 0) {
            leap = true;
            System.out.println(leap);
        } else {
            leap = false;
            System.out.println(leap);
        }
    }
}