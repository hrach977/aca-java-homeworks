//Given an array of ints, output true if every element is a ‘1’ or a ‘4’.
//NOTE: an empty array has no elements, so the result should be true in that case.

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkC9 {
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
        if (arr[0] == 1 || arr[0] == 4 || arr[0] == 0) {
            for (int i = 1; i < lngt; i++) {
                if (arr[i] != arr[0]) {
                    break;
                }
                out = true;
            }
            System.out.print(out);
        } else {
            System.out.print(out);
        }
    }
}