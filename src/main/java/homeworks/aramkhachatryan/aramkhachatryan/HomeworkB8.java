//  Take two integers from input. Output true if either of them is in the range 10..20 inclusive.
//  Test Data: 12, 1000
//  Expected Output: True

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkB8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integer numbers.");
        System.out.print("A: ");
        int num1 = input.nextInt();
        System.out.print("B: ");
        int num2 = input.nextInt();
        System.out.println((num1 >= 10 && num1 <= 20) || (num2 >= 10 && num2 <= 20));
    }
}