package homeworks.koryun.grigoryan.homework1;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        System.out.println("Enter a number in the range of 1-7");
        int number = input.nextInt();
        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
