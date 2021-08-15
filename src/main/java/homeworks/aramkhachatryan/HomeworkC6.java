//Given an array of ints, output true if the array contains no 1’s and no 3’s.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkC6 {
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
        boolean out = false;
        for (int j = 0; j < lngt; j++) {
            if ((arr[j] == 1) || (arr[j] == 3)) {
                out = true;
            }
        }
        System.out.println(out);
    }
}