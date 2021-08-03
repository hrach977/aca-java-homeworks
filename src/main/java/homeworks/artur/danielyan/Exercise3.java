package homeworks.artur.danielyan;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        a = Math.floor(a * 1000);
        b = Math.floor(b * 1000);
        if(a == b){
            System.out.println("They are the same up to three decimal places");
        }else{
            System.out.println("They are different");
        }
    }
}
