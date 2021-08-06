package homeworks.Khachatur_Asmaryan.Homework2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first boolean");
        boolean first = input.nextBoolean();
        System.out.println("Please enter the second boolean");
        boolean second = input.nextBoolean();
        if (first = second) {
            System.out.println("We are in trouble");
        }else {
            System.out.println("We are not in trouble");
        }
    }

}
