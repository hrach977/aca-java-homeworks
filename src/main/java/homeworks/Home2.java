package homeworks;

import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        numberOne = scanner.nextInt();
        System.out.println("Second number");
        numberTwo = scanner.nextInt();
        System.out.println(numberOne + ("/") + numberTwo + ("=") + numberOne / numberTwo );

        float number1;
        float number2;
        System.out.println("Input");
        number1 = scanner.nextInt();
        System.out.println("Second");
        number2 = scanner.nextInt();
        System.out.println(number1 + ("/") + number2 + ("=") + number1 / number2);




    }
}
