package homeworks.Khachatur_Asmaryan.Homework3;

import java.util.Scanner;

public class Exercise1b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("name please");
        String name = input.next();
        writename(name);
    }

    public static void writename(String name) {
        System.out.println("Hello" + " " + name + "!");
    }
}
