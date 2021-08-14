package homeworks.robert.mkhitaryan.homework3;

public class Exercise5 {
//    Given a string, and a Boolean parameter front, return a string length 1 from its front, unless
//    front is false, in which case return a string length 1 from its back. The string will be non-empty.
    public static String fromFrontOrFromBack(String string, boolean front) {
        return string.isEmpty() ? "" : front ? string.substring(0, 1) : string.substring(string.length() - 1);
    }
    public static void main(String[] args) {
        System.out.println(fromFrontOrFromBack("abcdefg", true));
        System.out.println(fromFrontOrFromBack("abcdefg", false));
        System.out.println(fromFrontOrFromBack("a", true));
        System.out.println(fromFrontOrFromBack("a", false));
        System.out.println(fromFrontOrFromBack("", true));
        System.out.println(fromFrontOrFromBack("", false));
    }
}
