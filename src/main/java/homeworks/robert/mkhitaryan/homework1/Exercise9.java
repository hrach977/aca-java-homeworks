package homeworks.robert.mkhitaryan.homework1;

import java.util.Scanner;

public class Exercise9 {
//    Take two Booleans from input, which represent whether two monkeys smile or not. We are in
//    trouble if they are both smiling or if neither of them is smiling. Output true if we are in trouble.
//    NOTE: try to provide at least 3 different solutions, each one should be shorter than the previous.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Is first monkey Smiling? : ");
        boolean isFirstMonkeySmiling = input.nextBoolean();
        System.out.print("Is second monkey Smiling? : ");
        boolean isSecondMonkeySmiling = input.nextBoolean();

//        First solution.
//        if (isFirstMonkeySmiling == isSecondMonkeySmiling) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

//        Second solution.
//        boolean areWeInTrouble = ((isFirstMonkeySmiling && isSecondMonkeySmiling) ||
//                                  (!isFirstMonkeySmiling && !isSecondMonkeySmiling));
//        System.out.println(areWeInTrouble);

//        Third solution.
        boolean areWeInTrouble = (isFirstMonkeySmiling == isSecondMonkeySmiling);
        System.out.println(areWeInTrouble);
    }
}
