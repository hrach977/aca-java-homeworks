package homeworks.robert.mkhitaryan.homework3;

public class Exercise15 {
//    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.The
//    string length will be at least 2.
    public static String rotateLeftTwo(String string) {
        return string.length() < 2 ? "" : string.substring(2) + string.substring(0, 2);
    }
    public static void main(String[] args) {
        System.out.println(rotateLeftTwo("fgabcde"));
        System.out.println(rotateLeftTwo("ab"));
        System.out.println(rotateLeftTwo("a"));
        System.out.println(rotateLeftTwo(""));
    }
}
