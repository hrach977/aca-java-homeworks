package homeworks.artur.danielyan.homework2;

public class Exercise14 {
    public static void main(String[] args) {
        int[] arr1 = {52,12,1,4,9,45,6,74};
        int[] arr2 = {4,52,8,1,45,74,52,6,3};

        for(int first : arr1){
            for(int second : arr2){
                if(first == second){
                    System.out.println(first);
                }
            }
        }
    }
}
