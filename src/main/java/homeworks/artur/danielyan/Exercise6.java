package homeworks.artur.danielyan;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers between 25 an 75");
        int a = input.nextInt();
        int b = input.nextInt();
        if((a>=25 && a<=75) && (b>=25 && b<=75)){
            String sa = Integer.toString(a);
            String sb = Integer.toString(b);
            boolean inboth = false;

            if((sa.charAt(0) == sb.charAt(0)) || (sa.charAt(0) == sb.charAt(1)) || (sa.charAt(1) == sb.charAt(0)) || (sa.charAt(1) == sb.charAt(1)) ){
                inboth = true;
            }
            System.out.println(inboth);
        }else{
            System.out.println("Entered number(s) isn't in the required range");
        }
    }
}
