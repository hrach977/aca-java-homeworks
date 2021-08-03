package homeworks.artur.danielyan;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//5 and 6 should be saved

        System.out.println("Please enter week day (number between 1 and 7)");
        int day = input.nextInt();
        String dayOfWeek;
        if(day == 1){
            dayOfWeek = "Monday";
        }else if(day == 2){
            dayOfWeek = "Tuesday";
        }else if(day == 3){
            dayOfWeek = "Wednesday";
        }else if(day == 4){
            dayOfWeek = "Thursday";
        }else if(day == 5){
            dayOfWeek = "Friday";
        }else if(day == 6){
            dayOfWeek = "Saturday";
        }else if(day == 7){
            dayOfWeek = "Sunday";
        }else {
            dayOfWeek = "Invalid day range";
        }
        System.out.println(dayOfWeek);
    }
}
