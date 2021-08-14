package homeworks.robert.mkhitaryan.homework3;

public class Exercise3 {
//    Given a string of even length, return the first half of the string. So the string “WooHoo” yields
//    “Woo”.
    public static String getTheFirstHalf(String string) {
        return string.substring(0, string.length() / 2);
    }
    public static void main(String[] args) {
        System.out.println(getTheFirstHalf("WooHoo"));
        System.out.println(getTheFirstHalf("HelloWorld"));
    }
}
