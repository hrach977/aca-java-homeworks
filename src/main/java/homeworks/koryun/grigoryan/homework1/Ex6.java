package homeworks.koryun.grigoryan.homework1;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println((num1 % 10 == num2%10) || (num1 % 10 == Math.round(num2/10)) || (Math.round(num1/10)==num2%10) || (Math.round(num1/10)) == Math.round(num2/10));
    }
}
