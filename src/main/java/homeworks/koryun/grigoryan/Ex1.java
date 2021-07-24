package homeworks.koryun.grigoryan;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double firstNumber = input.nextDouble();
        System.out.println("Enter another number");
        double secondNumber = input.nextDouble();
        double product = firstNumber*secondNumber;
        System.out.println(firstNumber+" * "+secondNumber+" = "+product);
    }
}
