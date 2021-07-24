package Lilit.Levonyan;
import java.util.Scanner;

public class Ex2 {
    //a
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner input = new Scanner(System.in);
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        //b
        double thirdNumber;
        double fourthNumber;
        thirdNumber = input.nextDouble();
        fourthNumber = input.nextDouble();
        System.out.println(thirdNumber + " / " + fourthNumber + " = " + (thirdNumber / fourthNumber));
    }

}
