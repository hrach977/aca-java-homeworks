// Given two arrays of ints of the same length,
// for every element in the first array consider the corresponding element in the second array
// (i.e. at the same index). Output the count of the number of times
// that the two elements differ by 2 or less, but are not equal.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkC10 {
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
        System.out.println("Please enter the elements of second array.");
        for (int i = 0; i < lngt; i++) {
            System.out.print(i + 1 + ". ");
            arr2[i] = input.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < lngt; i++) {
            if ((arr1[i] - arr2[i] != 0) && (Math.abs(arr1[i] - arr2[i]) < 3)) {
                counter++;
            }
        }
        System.out.println("the condition is satisfied " + counter + " times․");
    }
}