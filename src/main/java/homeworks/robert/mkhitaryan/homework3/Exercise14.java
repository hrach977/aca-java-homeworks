package homeworks.robert.mkhitaryan.homework3;

public class Exercise14 {
//    Given a string, return a version without the first and last char,so "Hello" yields "ell". The string
//    length will be at least 2.
    public static String removeFirstAndLastCharsOfTheString(String string) {
        return string.length() < 3 ? "" : string.substring(1, string.length() - 1);
    }
    public static void main(String[] args) {
        System.out.println(removeFirstAndLastCharsOfTheString("Hello"));
        System.out.println(removeFirstAndLastCharsOfTheString("Hi"));
        System.out.println(removeFirstAndLastCharsOfTheString("H"));
        System.out.println(removeFirstAndLastCharsOfTheString(""));
    }
}
