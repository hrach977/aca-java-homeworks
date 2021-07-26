package homeworks;

import java.util.Scanner;

public class Home8 {
    public static void main(String[] args) {
        int num;
        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Take two numbers from input");
        num = scanner.nextInt();
        num1 = scanner.nextInt();
        System.out.println("Maybe later" +" X = " + num + ","+ "Y = " + num1);
        System.out.println("After swapping" +" X = " + num1 + ","+ "Y = " + num);

    }
}
