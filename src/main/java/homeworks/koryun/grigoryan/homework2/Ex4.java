package homeworks.koryun.grigoryan.homework2;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double sum = 0;
        for(int  i = 1;i<=n;i++){
            sum+= 1.0/(double) i;
        }
        System.out.println(sum);

    }
}
