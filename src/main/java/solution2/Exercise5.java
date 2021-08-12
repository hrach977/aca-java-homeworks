package solution2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();

        boolean first = (year % 4 == 0) && (year % 100 != 0);
        boolean second = year % 400 == 0;

        if(first || second ){
            System.out.println(year + "is a leap year");
        }else{
            System.out.println(year + "not a leap year");
        }
    }
}
