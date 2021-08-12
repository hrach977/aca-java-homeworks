package homeworks.Khachatur_Asmaryan.Homework2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Please enter the number");
        number = input.nextInt();

        double sum = 0;
        int sign = 1;

        for (int i = 1; i <=number; i++) {
            sum += (1.0 * sign)/i;
            sign *= -1;
        }
        System.out.println("sum: " + sum) ;
    }

}
