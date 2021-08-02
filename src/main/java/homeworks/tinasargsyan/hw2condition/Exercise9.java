package homeworks.tinasargsyan.hw2condition;
/*
Take two Booleans from input, which represent whether two monkeys smile or not.
We are in trouble if they are both smiling
or if neither of them is smiling.
Output true if we are in trouble
 */
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first value");
        boolean monkey1 = sc.nextBoolean();
        System.out.println("Enter the second value");
        boolean monkey2 = sc.nextBoolean();
        if(monkey1==monkey2){
            System.out.println("true");
        }else
            System.out.println("false");
    }
}
