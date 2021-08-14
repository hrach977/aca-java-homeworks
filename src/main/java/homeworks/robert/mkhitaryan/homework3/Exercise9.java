package homeworks.robert.mkhitaryan.homework3;

public class Exercise9 {
//    Given a string, if the string begins with “red” or “blue” return that color string, otherwise return
//    the empty string.
    public static String isColorString(String string) {
        return string.startsWith("red") || string.startsWith("blue") ? string: "";
    }
    public static void main(String[] args) {
        System.out.println(isColorString("redColor"));
        System.out.println(isColorString("blueColor"));
        System.out.println(isColorString("noColor"));
        System.out.println(isColorString(""));
    }
}
