//Compute the natural logarithm of 2, by adding up to n terms in the series:
// 1 –½+ 1/3 –¼+ 1/5 -...1/n  ,where n is a positive integer input by user.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkC5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter n number: ");
        int n = input.nextInt();
        double sum = 1;
        if (n == 1) {
            System.out.println(sum);
        } else {
            for (double i = 2; i <= n; i++) {
                sum = (sum - 1 / i);
                sum *= (-1);
            }
            System.out.println(Math.abs(sum));
        }
    }
}