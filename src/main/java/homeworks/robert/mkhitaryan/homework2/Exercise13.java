package homeworks.robert.mkhitaryan.homework2;

import java.util.Arrays;

public class Exercise13 {
//    Write a program to reverse the elements of an integer array (1 dimensional).
    public static void main(String[] args) {
//        int[] arr = {4, 6, 9, 5};
        int[] arr = {4, 6, 9, 5, -1};
        System.out.println("Original array is : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] += arr[arr.length -1 - i];
            arr[arr.length -1 - i] = arr[i] - arr[arr.length -1 - i];
            arr[i] -= arr[arr.length -1 - i];
        }
        System.out.println("Reversed array is : " + Arrays.toString(arr));
    }
}
