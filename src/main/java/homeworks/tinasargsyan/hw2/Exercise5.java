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
        double sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum-=1.0/i;
            }else{
                sum+=1.0/i;
            }
        }
         System.out.println(sum);
        /*v2
        int sign = 1;
        for(int i=1;i<=n;i++){
            sum += (1.0 * sign)/i;
            sign *= -1;
        }
        System.out.println(sum);
         */
    }
}
