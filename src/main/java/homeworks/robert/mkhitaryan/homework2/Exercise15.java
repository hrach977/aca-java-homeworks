package homeworks.robert.mkhitaryan.homework2;

import java.util.Scanner;

public class Exercise15 {
//    Write a program to find all pairs of elements in an integer array whose sum is equal to a
//    specified number. The number is input by the user.
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 3, 4, 2, 3, 4, 6};
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == number) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + number);
                }
            }
        }
    }
}
