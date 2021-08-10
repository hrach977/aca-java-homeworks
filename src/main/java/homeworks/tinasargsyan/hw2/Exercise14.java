package homeworks.tinasargsyan.hw2;
/*
Write a program to find and
print the common elements between two arrays of integers.
 */
public class Exercise14 {
    public static void main(String[] args) {
        int[] arr0 = {1,2,3,4,5};
        int[] arr1 = {2,4,6,8,10};
        System.out.println("Common elements are ");
        for(int i=0;i< arr0.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr0[i] == arr1[j]){
                    System.out.println(arr0[i]);
                }
            }
        }
    }
}
