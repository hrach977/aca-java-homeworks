package homeworks.tinasargsyan.hw2;
/*
Given two arrays of ints of the same length,
for every element in the first array
consider the corresponding element in the second array
(i.e. at the same index).
Output the count of the number of times
that the two elements differ by 2 or less, but are not equal.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int[] arr0 = {1,2,3,4};
        int[] arr1 = {3,5,4,6};
        int count=0;
        for(int i=0; i<arr0.length;i++){
            if(arr0[i] != arr1[i] && Math.abs(arr0[i]-arr1[i])<2){
                count++;
            }
        }
        System.out.println(count);
    }
}
