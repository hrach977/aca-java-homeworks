package homeworks.tinasargsyan.hw3;
/*
Write a method that takes a name e.g.
“Bob”, and returns a greeting of the form “Hello Bob!”.
 */
import java.util.Scanner;

public class Exercise1 {
    public static String getName(String name){
        String newStr = "Hello ";
        return newStr + name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your name :)");
        String name = sc.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(getName(name));
    }
}
