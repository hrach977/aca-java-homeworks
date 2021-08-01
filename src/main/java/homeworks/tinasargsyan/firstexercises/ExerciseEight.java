package homeworks.tinasargsyan.firstexercises;
import java.util.Scanner;
/*
Take two numbers from input.
Swap them and print out.
 */

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int n;
        System.out.println("Please enter x ");
        x = input.nextInt();
        System.out.println("Please enter y ");
        y = input.nextInt();
        n = x;
        x = y;
        y = n;
        System.out.println("After swapping " + x + " " + y);
    }
}
