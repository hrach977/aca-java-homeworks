package homeworks.robert.mkhitaryan.homework3;

public class Exercise4 {
//    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be
//    at least length 1.
    public static String specialConcat(String firstString, String secondString) {
        return firstString.isEmpty() || secondString.isEmpty() ? "" : firstString.substring(1) + secondString.substring(1);
    }
    public static void main(String[] args) {
        System.out.println(specialConcat("abc","def"));
        System.out.println(specialConcat("a","b"));
        System.out.println(specialConcat("a",""));
        System.out.println(specialConcat("","b"));
    }
}
