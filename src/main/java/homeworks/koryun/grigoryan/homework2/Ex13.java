package homeworks.koryun.grigoryan.homework2;
import java.util.Arrays;
public class Ex13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 4, 8};
        for(int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
