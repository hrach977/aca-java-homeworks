package homeworks.Khachatur_Asmaryan.Homework0;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int x;
        int y;
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two number");
        System.out.println("X");
        x= input.nextInt();
        System.out.println("Y");
        y = input.nextInt();
        System.out.println("X befor swapping is " + x + "," + " Y befor swapping is " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping X is " + x + "," + " Y is " + y);
    }
}
