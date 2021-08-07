package homeworks.koryun.grigoryan.homework2;

public class Ex14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 5, 7, 8};
        int[] arr2 = {2, 0, 4, 12, 6};
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
