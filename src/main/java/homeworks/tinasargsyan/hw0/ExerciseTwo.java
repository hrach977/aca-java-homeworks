package homeworks.tinasargsyan.hw0;
/*
Take 2 numbers from input. Print the result of their division.
a) The input contains integers
b) The input contains floating point numbers
 */
import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int div;
        System.out.println("enter the first number");
        num1 = input.nextInt();
        System.out.println("enter the second number");
        num2 = input.nextInt();
        div = num1/num2;
        System.out.println(num1 + "/" + num2 + " = " + div);
        double num3;
        double num4;
        double div1;
        System.out.println("enter the first number");
        num3 = input.nextDouble();
        System.out.println("enter the second number");
        num4 = input.nextDouble();
        div1 = num3/num4;
        System.out.println(num3 + "/" + num4 + " = " + div1);
    }
}
