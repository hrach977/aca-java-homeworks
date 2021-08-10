package homeworks.artur.danielyan.homework2;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1,4,3,15,24,99,96,85,9,26,12,18,30,0,10,8,2,1};// check with 100 or 30 or 10

        System.out.println("Please enter the sum number");
        int sum = input.nextInt();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));
                }
            }
        }
    }
}
