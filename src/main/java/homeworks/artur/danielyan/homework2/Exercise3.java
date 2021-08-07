package homeworks.artur.danielyan.homework2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the term");
        int n = input.nextInt();
        int[] fiboncci = new int[n];
        fiboncci[0] = 0;
        fiboncci[1] = 1;

        for(int i = 2; i < n; i++){
            fiboncci[i] = fiboncci[i-2] + fiboncci[i-1];
        }
        for(int num : fiboncci) {
            System.out.println(num);
        }
    }
}
