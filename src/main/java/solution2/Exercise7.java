package solution2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter first second");
        int second = input.nextInt();

        System.out.println(first == 10 && second == 10 || (first + second == 10 ));
    }
}
