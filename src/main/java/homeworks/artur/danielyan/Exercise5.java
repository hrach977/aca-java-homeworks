package homeworks.artur.danielyan;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a year");
        int year = input.nextInt();
        if(year%4 == 0){
            System.out.println("Entered year is a leap year");
        }else{
            System.out.println("Entered year isn't a leap year");
        }
    }
}
