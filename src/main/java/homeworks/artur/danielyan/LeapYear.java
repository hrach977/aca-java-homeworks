package homeworks.artur.danielyan;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a year");
        int year = input.nextInt();
        boolean first = (year%4 == 0) && (year%100 != 0);
        boolean second = year%400 == 0;
        if(first || second){
            System.out.println("Entered year is a leap year");
        }else{
            System.out.println("Entered year isn't a leap year");
        }
    }
}
