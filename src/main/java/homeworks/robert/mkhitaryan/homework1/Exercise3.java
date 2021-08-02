package homeworks.robert.mkhitaryan.homework1;

import java.util.Scanner;

public class Exercise3 {
//    Take two floating point numbers from input. Check whether they are the same up to three decimal places.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firsNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        if ((int)(firsNumber * 1000)  == (int)(secondNumber * 1000)) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}
