package homeworks.tinasargsyan.hw2;
/*
Write a program to print Fibonacci series of n terms,
where n is input by user.
 */
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = sc.nextInt();
        double a = 0;
        double b = 1;
        double c = 0;
        System.out.println("Fibonacci series of n terms");
        for(int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }
    }
}
