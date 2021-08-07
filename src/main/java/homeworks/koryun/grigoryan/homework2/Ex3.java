package homeworks.koryun.grigoryan.homework2;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 0;
        int c = 1;
        int n = input.nextInt();
        for(int i = 1;i<n;i++){
            c=a+b;
            b = a;
            a=c;
        }
        System.out.println(c);
    }
}
