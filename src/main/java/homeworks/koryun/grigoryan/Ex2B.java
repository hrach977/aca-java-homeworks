package homeworks.koryun.grigoryan;
import java.util.Scanner;
public class Ex2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber = input.nextInt();
        System.out.println("Enter another number");
        int secondNumber = input.nextInt();
        float float_division =((float) firstNumber) / ((float)(secondNumber));
        System.out.println(firstNumber +" / "+secondNumber+" = "+float_division);

    }
}
