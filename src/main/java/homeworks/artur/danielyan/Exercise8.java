package homeworks.artur.danielyan;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        boolean bool = false;
        if( ((a>=10) && (a<=20)) || ((b>=10) && (b<=20)) ){
            bool = true;
        }
        System.out.println(bool);
    }
}
