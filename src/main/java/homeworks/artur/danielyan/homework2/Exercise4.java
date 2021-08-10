package homeworks.artur.danielyan.homework2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number");
        int n = input.nextInt();
        double result = 0;

        for(int i = 1; i <= n; i++){
            result += 1d/i;
        }
        System.out.println(result);

    }
}
