package homeworks.koryun.grigoryan;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        //first solution
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int first = input.nextInt();
        System.out.println("Enter another number");
        int second = input.nextInt();
        System.out.println("Before Swapping: X="+first+", Y="+second);
        first+=second;
        second = first-second;
        first-=second;
        System.out.println("After Swapping: X="+first+", Y="+second);

        //second solution
        // Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int first = input.nextInt();
//        System.out.println("Enter another number");
//        int second = input.nextInt();
//        System.out.println("Before Swapping: X="+first+", Y="+second);
//        int temp;
//
//        temp = first;
//        first=second;
//        second=temp;
//        System.out.println("After Swapping: X="+first+", Y="+second);


    }
}
