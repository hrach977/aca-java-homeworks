package homeworks.robert.mkhitaryan.homework2;

import java.util.Arrays;

public class Exercise8 {
//    Solve Exercise 7 without constructing a new array. Just modify the original one.
    public static void main(String[] args) {
        int[] originalArray = {6, 2, 5, 3};
//        int[] originalArray = {2, 5, 3, 45, 48, 0, -89, 55};
        System.out.println(Arrays.toString(originalArray));
        int temp = originalArray[0];
        for (int i = 0; i < originalArray.length - 1; i++) {
            originalArray[i] = originalArray[i+1];
        }
        originalArray[originalArray.length -1] = temp;
        System.out.println(Arrays.toString(originalArray));
    }
}
