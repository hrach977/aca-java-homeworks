package homeworks.tina.sargsyan;
import java.util.Scanner;
//Take a number from input. Print its multiplication table up to 10


public class ExerciseThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int i;
        System.out.println("Please enter the number");
        num = input.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
