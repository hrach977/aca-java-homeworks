package homeworks.koryun.grigoryan.homework1;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println((num1 >= 10 && num2<=20) || (num2>=10 && num2 <=20));
    }
}
