package homeworks.koryun.grigoryan.homework2;
import java.util.Arrays;
public class Ex7 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 3, 4, 7 ,1, 2};
        int[] new_arr = new int[arr.length];
        new_arr[new_arr.length-1] = arr[0];
        for(int i = 0;i<new_arr.length-1;i++){
            new_arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
