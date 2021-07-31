package homeworks.artur.danielyan;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean a = input.nextBoolean();
        boolean b = input.nextBoolean();
        boolean out = false;
        if( (a && b) || (!a && !b) ){
            out = true;
        }
        System.out.println(out);
    }
}
