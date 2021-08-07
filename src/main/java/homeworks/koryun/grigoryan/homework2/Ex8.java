package homeworks.koryun.grigoryan.homework2;
import java.util.Arrays;
public class Ex8 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 3};
        for(int i = 1;i<arr.length;i++){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
