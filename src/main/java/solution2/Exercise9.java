package solution2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first boolean");
        boolean first = input.nextBoolean();
        System.out.println("Enter second boolean");
        boolean second = input.nextBoolean();
        System.out.println(first == second);

    }
}
