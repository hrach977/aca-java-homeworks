package homeworks.koryun.grigoryan.homework1;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month(starting with capital letter)");
        String month = input.nextLine();
        System.out.println("Enter the year in numbers");
        int year = input.nextInt();
        int days=0;
        switch(month){
            case "January":days=31; break;
            case "March":days=31; break;
            case "April":days=30; break;
            case "May":days=31; break;
            case "June":days=30; break;
            case "July":days=31; break;
            case "August":days=31; break;
            case "September":days=30; break;
            case "October":days=31; break;
            case "November":days=30; break;
            case "December":days=31; break;
            case "February":{
                if(year%100==0){
                    if(year%400==0) {
                        days = 29;
                    }else{
                        days=28;
                    }
                }else if(year%4 == 0){
                    days=29;
                }else{
                    days=28;
                }
                break;
            }
            default:
                System.out.println("Invalid input");
                break;


        }
        System.out.println(days);
    }
}
