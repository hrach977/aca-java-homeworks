// Write a program to reverse the elements of an integer array (1 dimensional).

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkC13 {
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
        int temp = arr[0];
        for (int i = 0; i < lngt / 2; i++) {
            arr[i] = arr[lngt - (i + 1)];
            arr[lngt - (i + 1)] = temp;
            temp = arr[i + 1];
        }
        System.out.print("Reversed array: { ");
        for (int i = 0; i < lngt; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}