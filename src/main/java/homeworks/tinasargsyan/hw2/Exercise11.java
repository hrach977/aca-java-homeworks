package homeworks.tinasargsyan.hw2;
/*
Given an array length 1 or more of ints,
output the difference between the largest
and smallest values in the array.
 */
public class Exercise11 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 9, 20};
        int max = arr[0];
        int min = arr[0];
        int sum=0;
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        sum=max-min;
        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min);
        System.out.println("Difference "
                + max + " - " + min + " = " + sum);
    }
}
