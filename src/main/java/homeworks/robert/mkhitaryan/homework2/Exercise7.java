package homeworks.robert.mkhitaryan.homework2;

import java.util.Arrays;

public class Exercise7 {
//    Given an array construct another array that is the original array “left shifted” by one.
//    So, assuming the original array was {6, 2, 5, 3}, you should construct {2, 5, 3, 6}.
    public static void main(String[] args) {
        int[] originalArray = {6, 2, 5, 3};
//        int[] originalArray = {2, 5, 3, 45, 48, 0, -89, 55};
        int[] anotherArray = new int[originalArray.length];
        anotherArray[originalArray.length - 1] = originalArray[0];
        for (int i = 1; i < originalArray.length; i++) {
            anotherArray[i-1] = originalArray[i];
        }
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(anotherArray));
    }
}
