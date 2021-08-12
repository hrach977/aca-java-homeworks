package homeworks.Khachatur_Asmaryan.Homework2;

public class Exercise9 {
    public static void main(String[] args) {
        int[] nums = {1 , 1, 4, 4, 2, 1, 1, 1,};
        boolean flag = true;
        for ( int a : nums) {
            if ( a!=1 && a!=4) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
