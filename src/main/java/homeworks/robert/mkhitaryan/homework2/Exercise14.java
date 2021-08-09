package homeworks.robert.mkhitaryan.homework2;

import java.util.Arrays;

public class Exercise14 {
//    Write a program to find and print the common elements between two arrays of integers.
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 5, 7, 9, 18};
        int[] secondArray = {26, 2, 3, 9, 8, 1, 18, -15};
        System.out.println("First array is : " + Arrays.toString(firstArray));
        System.out.println("Second array is : " + Arrays.toString(secondArray));
        for (int i : firstArray) {
            for (int j : secondArray) {
                if (i == j) {
                    System.out.println(i + " is common element between above arrays.");
                }
            }
        }
    }
}
