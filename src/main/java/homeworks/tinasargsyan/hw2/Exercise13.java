package homeworks.tinasargsyan.hw2;
/*
Write a program to reverse the elements of an integer array (1 dimensional).
 */
public class Exercise13 {
    public static void main(String[] args) {
        int [] arr = {4,5,3,2,9};
//        System.out.println("Original Array ");
//        for(int i=0;i<arr.length;i++)
//            System.out.print(arr[i] + "  ");
//
//        System.out.println();
//
//        System.out.println("Reversed array ");
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i] + "  ");
//        }
        //V2
        int temp;
        for(int i=0; i<arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int elem : arr ){
            System.out.print(elem + " ");
        }
    }
}
