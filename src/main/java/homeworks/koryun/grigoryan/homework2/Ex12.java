package homeworks.koryun.grigoryan.homework2;

public class Ex12 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 2, 6, 7};
        int count =0;
        for(int num : arr){
            if(num == 2){
                count++;
            }
        }
        System.out.println(count==3);
    }
}
