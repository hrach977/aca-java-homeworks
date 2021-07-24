package homeworks.koryun.grigoryan;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber = input.nextInt();
        System.out.println("Enter another number");
        int secondNumber = input.nextInt();
        int product = firstNumber*secondNumber;
        System.out.println("The product of the entered numbers is "+product);
    }
}
