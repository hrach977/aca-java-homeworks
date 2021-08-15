// Write a program to find all pairs of elements in an integer array
// whose sum is equal to a specified number.
// The number is input by the user.

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkC15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of array: ");
        int lngt = input.nextInt();
        int[] arr = new int[lngt];
        System.out.println("Please enter the elements of array.");
        for (int i = 0; i < lngt; i++) {
            System.out.print(i + 1 + ". ");
            arr[i] = input.nextInt();
        }
        System.out.println("Please enter a number.");
        int num = input.nextInt();
        for (int i = 0; i < lngt; i++) {
            for (int j = i + 1; j < lngt; j++) {
                if ((j != i) && ((arr[i] + arr[j]) == num)) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }
            }
        }
    }
}