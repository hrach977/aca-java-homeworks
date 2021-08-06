package homeworks.tinasargsyan.hw1condition;
/*
Take a year from input.
Output whether that year is a leap year or not.
 */
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = sc.nextInt();
        boolean leap;
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            leap=true;
        }else{
            leap=false;
        }
        System.out.println(leap);
    }
}
