package homeworks.koryun.grigoryan.homework1;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1>=25 && num1<=75 && num2>=25 && num1<=75) {
            System.out.println((num1 % 10 == num2 % 10) || (num1 % 10 == num2 / 10) || (num1 / 10 == num2 % 10) || (num1 / 10 == num2 / 10));
        }else{
            System.out.println("invalid input: range should be [25;75]");
        }

    }
}
