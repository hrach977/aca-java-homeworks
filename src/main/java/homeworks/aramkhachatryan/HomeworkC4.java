// Write a program to calculate the sum of the following series,
// where n is input by user:1 +½+ 1/3 + ¼+ 1/5 + 1/6 + .... + 1/n

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkC4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter n number: ");
        int n = input.nextInt();
        double sum = 1;
        if (n == 1) {
            System.out.println(sum);
        } else {
            for (double i = 2; i <= n; i++) {
                sum = sum + 1 / i;
            }
            System.out.println(sum);
        }
    }
}