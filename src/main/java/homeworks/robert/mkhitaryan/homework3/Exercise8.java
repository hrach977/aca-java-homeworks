package homeworks.robert.mkhitaryan.homework3;

public class Exercise8 {
//    Given 2 string a and b, return a new string made of the first char of a and the last char of b. So,
//    “yo” and “java” yields “ya”. If either string is length 0, use ‘@’ for its missing char.
    public static String makeString(String a, String b) {
        return (a.isEmpty() ? "@" : a.substring(0, 1)) + (b.isEmpty() ? "@" : b.substring(b.length() - 1));
    }
    public static void main(String[] args) {
        System.out.println(makeString("yo", "java"));
        System.out.println(makeString("", "java"));
        System.out.println(makeString("yo", ""));
        System.out.println(makeString("", ""));
    }
}
