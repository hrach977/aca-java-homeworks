package Lilit.Levonyan;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        double inches;
        double meters;
        Scanner input = new Scanner(System.in);
        inches = input.nextFloat();
        meters = inches * 0.0254;
        System.out.println(inches + " inches is " + meters + " meters");
    }
}
