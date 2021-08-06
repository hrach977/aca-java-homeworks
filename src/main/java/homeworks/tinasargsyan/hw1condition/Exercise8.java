package homeworks.tinasargsyan.hw1condition;
/*
Take two integers from input.
Output true if either of them is in the range 10..20 inclusive.
 */
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        if((num1>=10) && (num1<=20) || (num2>=10) && (num2<=20)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        //System.out.println((num1>=10) && (num1<=20) || (num2>=10) && (num2<=20));
    }
}
