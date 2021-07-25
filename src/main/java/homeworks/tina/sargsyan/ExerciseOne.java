package homeworks.tina.sargsyan;
import java.util.Scanner;
//Take 2 numbers from input. Print their product.


public class ExerciseOne {
    public static void main(String[] args) {
        int num1;
        int num2;
        int product;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        num1 = input.nextInt();
        System.out.println("enter the second number");
        num2 = input.nextInt();
        product = num1*num2;
        System.out.println(num1 + "*" + num2 + " = " + product);
    }
}
