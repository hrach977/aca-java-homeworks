package homeworks.Khachatur_Asmaryan.Homework3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        double sum = 0;

        System.out.println("Enter number of terms of series :");
        num = input.nextInt();

        for ( int i = 1; i<=num; i++) {
            sum+=1.0/i;
        }
        System.out.println("Sum : " + sum);

    }
}
