package homeworks.tinasargsyan.hw2condition;
/*
Take two floating point numbers from input.
Check whether they are the same up to three decimal places
 */
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();
        num1 = Math.round(num1 * 1000);
        num2 = Math.round(num2 * 1000);
        //System.out.println(num1);
        //System.out.println(num2);
        if (num1 == num2) {
            System.out.println("They are the same up to three decimal places");
        }else {
            System.out.println("They are different");
        }
    }
}
