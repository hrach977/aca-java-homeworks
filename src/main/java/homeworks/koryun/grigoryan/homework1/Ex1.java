package homeworks.koryun.grigoryan.homework1;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number in the range of 1-7");
        int number = input.nextInt();
        String dayOfWeek="";
        if (number==1){
            dayOfWeek = "Monday";
        }else if(number==2){
            dayOfWeek = "Tuesday";
        }else if(number == 3){
            dayOfWeek="Wednesday";
        }else if(number==4){
            dayOfWeek="Thursday";

        }else if(number == 5){
            dayOfWeek="Friday";

        }else if(number==6){
            dayOfWeek = "Saturday";
        }else if(number==7){
            dayOfWeek = "Sunday";
        }else{
            System.out.println("invalid input");
        }
        System.out.println(dayOfWeek);
    }
}
