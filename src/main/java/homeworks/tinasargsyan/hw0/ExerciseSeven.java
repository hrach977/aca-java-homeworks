package homeworks.tinasargsyan.hw0;
import java.util.Scanner;
/*
Take 5 numbers from input.
Output their sum and average.
 */


public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int i;
        int sum=0;
        double average;
        System.out.println("Please enter the numbers ");
        for (i=0;i<5;i++){
            //System.out.println("Please enter the numbers ");
            num = input.nextInt();
            sum+=num;
        }
        average = sum/5;
        System.out.println("The sum of the numbers " + sum + " The average of the numbers " + average);
    }
}
