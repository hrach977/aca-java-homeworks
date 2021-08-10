package homeworks.artur.danielyan.homework2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm;

        System.out.println("Please enter number of terms of series");
        int number = input.nextInt();

        System.out.print(firstTerm + " " + secondTerm + " ");

        for(int i = 3; i <=number; i++){
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}
