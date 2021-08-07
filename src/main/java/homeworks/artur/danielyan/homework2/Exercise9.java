package homeworks.artur.danielyan.homework2;

public class Exercise9 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        int[] arr = {1,4,4,1,4,1,1,4};
//        int[] arr = {};

        boolean flag = true;

        if(arr.length != 0){
            for(int e : arr){
                if(e != 1 && e !=4){
                    flag = false;
                }
            }
        }
        System.out.println(flag);
    }
}
