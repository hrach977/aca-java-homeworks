package homeworks.tinasargsyan.hw1condition;
//Take a number from input between 1-7.
//Output the corresponding day of week.

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the day");
        int number = sc.nextInt();
        String dayOfWeek=" ";
        if (number == 1){
            //System.out.println("Monday");
            dayOfWeek = "Monday";
        }else if(number == 2){
            System.out.println("Tuesday");
        }else if(number == 3) {
            System.out.println("Wednesday");
        }else if(number == 4) {
            System.out.println("Thursday");
        }else if(number == 5) {
            System.out.println("Friday");
        }else if(number == 6) {
            System.out.println("Saturday");
        }else if(number == 7) {
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid day range");
        }
        System.out.println(dayOfWeek);
    }
}
