package homeworks.Khachatur_Asmaryan.Homework1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        float fahrenheit;
        float celsius;
        Scanner input = new Scanner(System.in);
        fahrenheit = input.nextFloat();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " degree in Fahrenheit is equal to " +  celsius + " in Celsius");
    }
}
