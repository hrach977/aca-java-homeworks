package homeworks.koryun.grigoryan.homework0;
import java.util.Scanner;
public class Ex2A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber = input.nextInt();
        System.out.println("Enter another number");
        int secondNumber = input.nextInt();
        int int_division = firstNumber/secondNumber;
        System.out.println(firstNumber +" / "+secondNumber+" = "+int_division);
    }
}