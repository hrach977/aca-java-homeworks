package homeworks.robert.mkhitaryan.homework1;

import java.util.Scanner;

public class Exercise8 {
//    Take two integers from input. Output true if either of them is in the range 10..20 inclusive.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        int firstInteger = input.nextInt();
        System.out.print("Please enter the second integer: ");
        int secondInteger =input.nextInt();
        if (((firstInteger >= 10) && (firstInteger <= 20)) || ((secondInteger >= 10) && (secondInteger <= 20))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
