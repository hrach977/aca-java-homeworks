//Write a program to calculate the sum of the following series,
// where n is input by user:1 +½+ 1/3 + ¼+ 1/5 + 1/6 + .... + 1/n

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkC4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter n number: ");
        int n = input.nextInt();
        double sum = 0;
        for (double i = 0; i <= n; i++) {
            sum = sum + 1 / (i + 1);
        }
        System.out.println(sum);
    }
}
