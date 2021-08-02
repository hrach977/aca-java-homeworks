//  Take two integers from input between 25 and 75. Output true if there’s a common digit in both numbers.
//  Test Data: 26, 64
//  Expected Output: true

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkB6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter two integer numbers between 25 and 75");
        System.out.print("A: ");
        int num1 = input.nextInt ();
        String numstr1 = Integer.toString(num1);
        System.out.print("B: ");
        int num2 = input.nextInt ();
        String numstr2 = Integer.toString(num2);
        char char11 = numstr1.charAt(0);
        char char12 = numstr1.charAt(1);
        char char21 = numstr2.charAt(0);
        char char22 = numstr2.charAt(1);
        if ((num1>25) && (num1<75) && (num2>25) && (num2<75)) {
            if (char11==char21) {
                System.out.println("True");
            } else if (char11==char22) {
                System.out.println("True");
            } else if (char12==char21) {
                System.out.println("True");
            } else if (char12==char22) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.print("One or more numbers are not in the range");
        }
    }
}