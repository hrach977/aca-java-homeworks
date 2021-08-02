package homeworks.tinasargsyan.hw2condition;
/*
Take a string from input representing a month
and a number representing the year.
Output the number of days in that month.
 */
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the month");
        int month = sc.nextInt();
        System.out.println("Please enter the year");
        int year = sc.nextInt();
        int days=0;
        if(month ==1 || month ==3 ||month==5 ||month==7||month==8||month==10||month==12){
            days=31;
        }else if(month==4||month==6||month==9||month==11){
            days=30;
        }else if(month==2){
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                days=29;
            }else{
                days=28;
            }
        }
        System.out.println(days + " days" );
    }
}
