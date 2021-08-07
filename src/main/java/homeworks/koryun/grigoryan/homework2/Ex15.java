package homeworks.koryun.grigoryan.homework2;
import java.util.Scanner;
import java.util.Arrays;
public class Ex15 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 3, 19};
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (Math.abs(arr[i]+arr[j]) == target){
                    System.out.println(Arrays.toString(new int[]{arr[i],arr[j]}));
                }
            }
        }
    }
}
