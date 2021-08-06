package homeworks.tinasargsyan.hw1condition;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day ");
        int number = sc.nextInt();
        String dayOfWeek=" ";
        switch(number){
            case 1:
                dayOfWeek="Monday";
            break;
            case 2:
                dayOfWeek="Tuesday";
                break;
            case 3:
                dayOfWeek="Wednesday";
                break;
            case 4:
                dayOfWeek="Thursday";
                break;
            case 5:
                dayOfWeek="Friday";
                break;
            case 6:
                dayOfWeek="Saturday";
                break;
            case 7:
                dayOfWeek="Sunday";
                break;
            default:
                System.out.println("Invalid day range");
                break;
        }
        System.out.println(dayOfWeek);
    }
}
