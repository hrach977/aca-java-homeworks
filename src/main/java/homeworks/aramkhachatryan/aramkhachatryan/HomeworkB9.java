//  Take two Booleans from input, which represent whether two monkeys smile or not.
//  We are in trouble if they are both smiling or if neither of them is smiling.
//  Output true if we are in trouble.
//  Test Data: true, true Expected Output: true
//  Test Data: true, false Expected Output: false
//  Test Data: false, false Expected Output: true
//  NOTE: try to provide at least 3 different solutions, each one should be shorter than the previous.
//  PS: Do not hardcode the cases :)

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkB9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whether each of two monkeys smile or not.");
        System.out.println("Please enter \"True\" or \"False\".");
        System.out.print("First monkey: ");
        boolean monkey1 = input.nextBoolean();
        System.out.print("Second monkey: ");
        boolean monkey2 = input.nextBoolean();
        System.out.print(monkey1==monkey2);
    }
}
