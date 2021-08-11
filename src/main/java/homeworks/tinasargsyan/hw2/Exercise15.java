package homeworks.tinasargsyan.hw2;
/*
Write a program to find all pairs of elements in an integer array
whose sum is equal to a specified number.
The number is input by the user.
 */
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the specified number ");
        int n = sc.nextInt();
        int[] arr = {1,3,5,6,9,8};
        System.out.println("the elements whose sum is: "+ n);
        for(int i=0; i<arr.length; i++){
//            for (int j=i; j<arr.length; j++){
//                if((arr[i]+arr[j])== n && i!=j){
            //V2
            for (int j=i+1; j<arr.length; j++){
                 if((arr[i]+arr[j])== n)
                    System.out.println(arr[i] + " + " + arr[j] + " = " + n);
                }
            }
        }
    }
