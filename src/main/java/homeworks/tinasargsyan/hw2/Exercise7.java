package homeworks.tinasargsyan.hw2;
/*
Given an array construct another array that is the original array “left shifted” by one.
So, assuming the original array was {6, 2, 5, 3}, you should construct {2, 5, 3, 6}.
 */
import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        int[] arr1 = {arr[1], arr[2], arr[3],arr[0]};
//        System.out.println("The original array " + Arrays.toString(arr));
//        System.out.println("New array " + Arrays.toString(arr1));

        if(arr.length!=0){
            int[] res = new int [arr.length];
            for(int i=1;i<arr.length;i++){
                res[i-1] = arr[i];
            }
            res[res.length-1] = arr[0];
            for(int element : res){
                System.out.print(element + " ");
            }
        }
    }
}
