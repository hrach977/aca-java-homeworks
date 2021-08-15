// Write a program to find and print the common elements between two arrays of integers.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkC14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of first array: ");
        int lngt1 = input.nextInt();
        int[] arr1 = new int[lngt1];
        System.out.println("Please enter the elements of first array.");
        for (int i = 0; i < lngt1; i++) {
            System.out.print(i + 1 + ". ");
            arr1[i] = input.nextInt();
        }
        System.out.print("Please enter the length of second array: ");
        int lngt2 = input.nextInt();
        int[] arr2 = new int[lngt2];
        System.out.println("Please enter the elements of second array.");
        for (int i = 0; i < lngt2; i++) {
            System.out.print(i + 1 + ". ");
            arr2[i] = input.nextInt();
        }
        System.out.print("Common elements of arrays are: ");
        for (int i = 0; i < lngt1; i++) {
            for (int j = 0; j < lngt2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+ " ");
                }
            }
        }
    }
}