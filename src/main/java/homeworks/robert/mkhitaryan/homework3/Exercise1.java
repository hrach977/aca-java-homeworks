package homeworks.robert.mkhitaryan.homework3;

public class Exercise1 {
//    Write a method that takes a name e.g. “Bob”, and returns a greeting of the form “Hello Bob!”.
    public static String greeting(String name) {
        return "\"Hello " + name + "!\"";
    }
    public static void main(String[] args) {
        System.out.println(greeting("Bob"));
        System.out.println(greeting("Mary"));
    }
}
