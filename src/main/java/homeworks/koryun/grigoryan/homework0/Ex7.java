package homeworks.koryun.grigoryan.homework0;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum=0;
        double average=0;
        int count=0;
        System.out.println("Enter a number");
        while(input.hasNext()){
            System.out.println("Enter a number");
            sum += input.nextDouble();
            count++;
            if (count==5){
                break;
            }
        }
        average=sum/count;
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+average);
    }
}
