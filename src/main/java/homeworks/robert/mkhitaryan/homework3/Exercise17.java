package homeworks.robert.mkhitaryan.homework3;

public class Exercise17 {
//    Given a string, return a string where for every char in the original, there are two chars.
    public static String  repeatChars(String string) {
        StringBuilder otherString = new StringBuilder();
        for (char ch : string.toCharArray()) {
            otherString.append(ch).append(ch);
        }
        return otherString.toString();
    }
    public static void main(String[] args) {
        System.out.println(repeatChars("abcdefg"));
        System.out.println(repeatChars(""));
    }
}
