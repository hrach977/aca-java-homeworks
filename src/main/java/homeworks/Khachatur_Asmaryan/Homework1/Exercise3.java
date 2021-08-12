package homeworks.Khachatur_Asmaryan.Homework1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        float num1;
        float num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        num1 = input.nextFloat();
        System.out.println("Please enter the second number ");
        num2 = input.nextFloat();
        int num3 = (int)( num1*1000 );
        int num4 = (int)( num2*1000 );
        if( num3 == num4 ) {
            System.out.println("they are the same up to three decimal places");
        }else {
            System.out.println("They are different");
        }
    }
}
