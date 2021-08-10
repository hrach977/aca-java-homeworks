//Solve Exercise 7 without constructing a new array. Just modify the original one.

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkC8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of arrays: ");
        int lngt = input.nextInt();
        int[] arr = new int[lngt];
        System.out.println("Please enter the elements of first array.");
        System.out.print("1. ");
        arr[lngt-1] = input.nextInt();
        for (int i = 1; i < lngt; i++) {
            System.out.print(i + 1 + ". ");
            arr[i-1] = input.nextInt();
        }
        System.out.print("Second array elements: { ");
        for (int i = 0; i < lngt; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}