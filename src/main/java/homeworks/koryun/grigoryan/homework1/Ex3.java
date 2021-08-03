package homeworks.koryun.grigoryan.homework1;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a floating point number");
        double num1 = input.nextFloat();
        System.out.println("Enter another floating point number");
        double num2 = input.nextFloat();
        num1 = Math.floor(1000.0 * num1);
        num1 /=1000.0;
        num2 = Math.floor(1000.0*num2);
        num2 /=1000.0;
        System.out.println(num1==num2);

    }
}
