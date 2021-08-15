// Given an array of ints, output true if the sum of all the ‘2’-s in the array is exactly ‘8’.

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkC12 {
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
        int counter = 0;
        for (int i = 0; i < lngt; i++) {
            if (arr[i] == 2) {
                counter++;
            }
        }
        System.out.println(counter == 4);
    }
}
