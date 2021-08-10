package homeworks.tinasargsyan.hw2;
/*
Write a program to calculate the sum of the following series,
where n is input by user:
1 + ½ + 1/3 + ¼ + 1/5 + 1/6 + …. + 1/n
 */
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = sc.nextInt();
        double sum = 0;
        for (int i=1;i<=n;i++){
            sum+=(1.0/i);
        }
        System.out.println("The sum of the following series " + sum);
    }
}
