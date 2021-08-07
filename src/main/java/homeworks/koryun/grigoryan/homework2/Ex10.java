package homeworks.koryun.grigoryan.homework2;

public class Ex10 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 4 ,8 };
        int[] arr2 = {2, 10, 5, 3, 10};
        int count = 0;
        for(int i = 0;i<arr1.length;i++){
            if ((Math.abs(arr1[i] - arr2[i]) <= 2) &&(arr1[i]!=arr2[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
