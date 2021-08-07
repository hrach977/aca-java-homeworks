package homeworks.koryun.grigoryan.homework2;

public class Ex9 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 1, 1, 3};
        boolean flag = true;
        for(int num : arr){
            if (!(num ==1 || num==4)){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
