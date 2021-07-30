package homeworks.aramazd.poghosyan.homework2;

/*
*   Take two Booleans from input, which represent whether two monkeys smile or not.
*   We are in trouble if they are both smiling or if neither of them is smiling. Output true if we are in trouble.
*   Test Data: true, true Expected Output: true
*   Test Data: true, false Expected Output: false
*   Test Data: false, false Expected Output: true
*   NOTE: try to provide at least 3 different solutions, each one should be shorter than the previous.
*   PS: Do not hardcode the cases :)
*/

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first boolean: ");
        boolean first = scanner.nextBoolean();
        System.out.print("Enter second boolean: ");
        boolean second = scanner.nextBoolean();

//        option 1
//        if (first == second)
//            System.out.println(true);
//        else
//            System.out.println(false);

//        option 2
        System.out.println(first == second);

//        I didn't find a shorter version )

    }
}
