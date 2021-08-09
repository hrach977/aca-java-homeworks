package homeworks.tinasargsyan.hw2;
/*
Solve Exercise 7 without constructing a new array.
Just modify the original one.
*/
import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {
        int[] arr = {15, 2, 56, 7};
        System.out.println("Original Array "+Arrays.toString(arr));

        if(arr.length >1) {
            int first = arr[0];
            for(int i = 1; i < arr.length; i++)
                arr[i - 1] = arr[i];

            arr[arr.length - 1] = first;
            System.out.println("Modified Array "+Arrays.toString(arr));
        }
    }
}
