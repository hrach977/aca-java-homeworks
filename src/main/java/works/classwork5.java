package works;

import java.util.Scanner;

public class classwork5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        double number = input.nextDouble();

        if (number == 0){
            System.out.println("The number is zero");
        }else if (number > 0){
            if (number < 1) {
                System.out.println("This is a small positive number");
            } else  if (number > 1_000_000){
                System.out.println("This is a large positive number");
            }else{
                System.out.println("This is a positive number");
            }
        }else{
            if (Math.abs(number) < 1){
                System.out.println("This is a small negative number");
            }else if (Math.abs(number) > 1_000_000){
                System.out.println("This is a large negative number");
            }else{
                System.out.println("this is a negative number");

            }
        }
    }
}
