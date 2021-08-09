package homeworks.tinasargsyan.hw2;
/*
Given an array of ints,
output true if the array contains no 1’s and no 3’s.
 */
import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Please enter the limit of elements values of the array");
        int limit = sc.nextInt();

        boolean flag=false;

        Random rand = new Random();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i] = rand.nextInt(limit);
            System.out.println(arr[i]);
            if((arr[i]==1) && (arr[i]==3)){
                flag=false;
            }else{
                flag = true;
            }
        }

         System.out.println(flag);
    }
}
