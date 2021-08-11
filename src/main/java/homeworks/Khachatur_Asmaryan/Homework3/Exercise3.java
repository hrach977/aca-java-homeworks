package homeworks.Khachatur_Asmaryan.Homework3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        int naxaverjin = 0;
        int verjin = 1;
        int nerkayins;

        System.out.println("Please enter number of terms of series");
        number = input.nextInt();

        System.out.print(naxaverjin + " " + verjin + " ");

        for (int i = 3; i<=number; i++) {
            nerkayins = naxaverjin + verjin;
            System.out.print(nerkayins + " ");
            naxaverjin = verjin;
            verjin = nerkayins;
        }

    }

}
