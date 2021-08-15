// Given an array length 1 or more of ints,
// output the difference between the largest and smallest values in the array.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkC11 {
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
        int min = arr[0], max = arr[0];
        for (int i = 1; i < lngt; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The difference between the largest and smallest values in the array is " + (max-min)+".");
    }
}
