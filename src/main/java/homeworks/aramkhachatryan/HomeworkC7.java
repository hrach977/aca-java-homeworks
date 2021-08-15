//Given an array construct another array that is the original array “left shifted” by one.
// So, assuming the original array was {6, 2, 5, 3}, you should construct {2, 5, 3, 6}.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkC7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of arrays: ");
        int lngt = input.nextInt();
        int[] arr1 = new int[lngt];
        int[] arr2 = new int[lngt];
        System.out.println("Please enter the elements of first array.");
        for (int i = 0; i < lngt; i++) {
            System.out.print(i + 1 + ". ");
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < lngt-1; i++) {
            arr2[i] = arr1[i+1];
        }
        arr2[lngt-1]=arr1[0];
        System.out.print("Second array elements: { ");
        for (int i = 0; i < lngt; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("}");
    }
}