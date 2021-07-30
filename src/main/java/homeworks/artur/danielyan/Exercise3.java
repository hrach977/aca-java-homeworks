package homeworks.artur.danielyan;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        int a1 = (int)(a*1000);
        int b1 = (int)(b*1000);
        if(a1 == b1){
            System.out.println("They are the same up to three decimal places");
        }else{
            System.out.println("They are different");
        }
    }
}
