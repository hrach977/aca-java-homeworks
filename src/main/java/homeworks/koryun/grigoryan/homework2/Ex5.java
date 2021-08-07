package homeworks.koryun.grigoryan.homework2;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double sum=0;
        for(int i = 1;i<=n;i++){
            double current = (1.0/(double) i);
            if (i %2==1){
                sum+=current;
            }else{
                sum-=current;
            }
        }
        System.out.println(sum);

    }
}
