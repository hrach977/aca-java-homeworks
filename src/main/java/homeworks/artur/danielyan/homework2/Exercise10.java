package homeworks.artur.danielyan.homework2;

public class Exercise10 {
    public static void main(String[] args) {
        int[] arr1 = {4,6,5,91,12,1,9};
        int[] arr2 = {5,4,5,18,82,3,8};

        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            if( (arr1[i] - arr2[i] <= 2) && (arr1[i] - arr2[i] >= -2) && (arr1[i] - arr2[i] != 0) ){
                count++;
            }
        }
        System.out.println(count);
    }
}
