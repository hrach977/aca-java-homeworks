package works;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("enter positive number");
        int number = input.nextInt();

        boolean flag = true;

        for (int i=2; i<number; i++){
            if (number%i != 0){
                flag = false;
                break;
            }
        }
        if (flag && number>1){
            System.out.println("number is prime");
        }else{
            System.out.println("number in not prime");
        }
    }
}
