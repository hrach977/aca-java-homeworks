package homeworks.koryun.grigoryan.homework0;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.format("Here comes the multiplication table of number %d from 1 to 10", num);
        System.out.println();
        for(int i = 1;i<=10;i++){
            System.out.format("%d * %d = "+i*num, num, i);
            System.out.println();
        }

    }
}
