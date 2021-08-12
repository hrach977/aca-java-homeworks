package works;

import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number");
        int num2 = input.nextInt();
        System.out.println("Please enter the third number");
        int num3 = input.nextInt();
        if (num1 > num2){
            if (num1> num3){
                System.out.println("the greatest number is " + num1);

            }
        }  if (num2 > num1){
            if (num2 > num3){
                System.out.println("the greatest number is " + num2);

            }
        } if (num3 > num1){
            if (num3 > num2){
                System.out.println("the greatest number is " + num3);
            }
        }

    }



}
