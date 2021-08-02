package homeworks.koryun.grigoryan.homework1;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month(starting with capital letter)");
        String month = input.nextLine();
        System.out.println("Enter the year");
        int year = input.nextInt();
        int days;
        if ("January".equals(month)){
            days = 31;
        }else if("March".equals(month)){
            days = 31;
        }else if("April".equals(month)){
            days=30;
        }else if("May".equals(month)){
            days = 31;
        }else if("June".equals(month)){
            days = 30;
        }else if ("July".equals(month)){
            days=31;
        }else if("August".equals(month)){
            days=  31;
        }else if("September".equals(month)){
            days=30;
        }else if("October".equals(month)){
            days=31;
        }else if("November".equals(month)){
            days=30;
        }else if ("December".equals(month)){
            days = 31;
        }else if("February".equals(month)) {
            if (year%100 == 0) {
                if (year%400==0) {
                    days = 29;
                }else{
                    days=28;
                }
            }else if(year%4==0){
                days=29;
            }else {
                days = 28;
            }
        }else{
            days=0;
            System.out.println("Invalid input");
        }
        System.out.println(days);
    }
}
