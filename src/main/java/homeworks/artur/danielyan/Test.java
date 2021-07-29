package homeworks.artur.danielyan;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        System.out.println("The greatest number is: " + Math.max(Math.max(a,b), Math.max(c,d)));
    }
}
