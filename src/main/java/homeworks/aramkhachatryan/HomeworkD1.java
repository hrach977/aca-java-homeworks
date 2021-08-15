// Exercise 1
// Write a method that takes a name e.g.
// “Bob”, and returns a greeting of the form “Hello Bob!”.

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkD1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a name: ");
        String name = input.next();
        nameMethod(name);
    }
    public static void nameMethod(String name) {
        System.out.print("Hello " + name +"!");
    }
}