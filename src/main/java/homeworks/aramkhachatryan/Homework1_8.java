import java.util.Scanner;

public class Homework1_8 {
    public static void main(String[] args) {
        int numberX;
        int numberY;
        int numberZ;
        System.out.println("Please enter two numbers: ");
        Scanner input = new Scanner(System.in);
        System.out.print("X = ");
        numberX = input.nextInt();
        System.out.print("Y = ");
        numberY = input.nextInt();
        System.out.println("Before swapping: X = " + numberX + ", Y = " + numberY);
        numberZ = numberY;
        numberY = numberX;
        numberX = numberZ;
        System.out.println("After swapping: Y = " + numberY + ", X = " + numberX);
    }
}