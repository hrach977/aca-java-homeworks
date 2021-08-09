package homeworks.tinasargsyan.hw2;
/*
Compute the natural logarithm of 2,
by adding up to n terms in the series:
1 – ½ + 1/3 – ¼ + 1/5 - … 1/n ,
where n is a positive integer input by user.
 */
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = sc.nextInt();
        double sum1= 0;
        double sum2= 0;
        double sum;
        for(double i=1;i<=n;i++){
            if(i%2==0){
                sum1-=1/i;
            }else{
                sum2+=1/i;
            }
        }
        sum=sum1+sum2;
        System.out.println(sum);
    }
}
