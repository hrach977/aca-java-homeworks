package homeworks.tinasargsyan.hw1condition;
/*
Take two numbers from input.
Output true if one of them is 10 or if their sum is 10.
 */
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        if (a==10 && b!=10 ){
            System.out.println("True");
        }else if(a!=10 && b==10){
            System.out.println("True");
        }else if((a+b)==10){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
