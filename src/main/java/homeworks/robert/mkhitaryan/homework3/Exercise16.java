package homeworks.robert.mkhitaryan.homework3;

public class Exercise16 {
//    Given a string, return a version without both the first and last char of the string.The string may
//    be any length, including 0.
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
