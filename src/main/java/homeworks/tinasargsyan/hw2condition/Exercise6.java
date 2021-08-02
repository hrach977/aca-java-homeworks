package homeworks.tinasargsyan.hw2condition;
//Take two integers from input between 25 and 75.
//Output true if there’s a common digit in both numbers.
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number from 25 to 75");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number from 25 to 75");
        int num2 = sc.nextInt();

        int a = num1%10;
        int b = num2%10;
        num1 /=10;
        num2 /=10;
        if(a==b){
            System.out.println("True");
        }else if(a==num2){
            System.out.println("True");
        }else if(num1==num2){
            System.out.println("True");
        }else if(b==num1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
