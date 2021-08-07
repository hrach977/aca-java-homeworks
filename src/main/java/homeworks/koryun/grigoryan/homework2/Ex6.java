package homeworks.koryun.grigoryan.homework2;

public class Ex6 {
    public static void main(String[] args) {
        int[] arr = {6, 4, 7, 3};
        boolean flag = true;
        for (int n : arr){
            if (n == 1 || n==3){
                flag=false;
                break;
            }
        }
        System.out.println(flag);

    }
}
