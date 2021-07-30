package homeworks.aramazd.poghosyan.homework2;

/*
*   Take two numbers from input. Output true if one of them is 10 or if their sum is 10.
*   Test Data: 2, 8
*   Expected Output: true
*/

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

//        first
//        boolean isSumTen = (num1 + num2 == 10);
//        boolean isNum1Ten = num1 == 10;
//        boolean isNum2Ten = num2 == 10;
//        boolean isOneIsTen = ((isNum1Ten && !isNum2Ten) || (!isNum1Ten && isNum2Ten)) || isSumTen;
//
//        System.out.println(isOneIsTen);

        System.out.println(((num1 + num2 == 10) || (num1 == 10) || (num2 == 10)));



    }
}
