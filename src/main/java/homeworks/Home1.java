package homeworks;

import java.util.Scanner;

public class Home1 {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        numberOne = scanner.nextInt();
        System.out.println("Second number");
        numberTwo = scanner.nextInt();
        System.out.println(numberOne + ("*") + numberTwo + ("=") + numberOne * numberTwo );




    }
}
