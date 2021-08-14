package homeworks.robert.mkhitaryan.homework3;

public class Exercise13 {
//    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.The
//    string length will be at least 2.
    public static String maKeOfThreeCopiesOfTheLastTwoCharsOfTheString (String string) {
        int length = string.length();
        return string.length() < 2 ?  "" : string.substring(length - 2) +
                                           string.substring(length - 2) +
                                           string.substring(length - 2);
    }
    public static void main(String[] args) {
        System.out.println(maKeOfThreeCopiesOfTheLastTwoCharsOfTheString("abcdefg"));
        System.out.println(maKeOfThreeCopiesOfTheLastTwoCharsOfTheString("ab"));
        System.out.println(maKeOfThreeCopiesOfTheLastTwoCharsOfTheString("a"));
        System.out.println(maKeOfThreeCopiesOfTheLastTwoCharsOfTheString(""));
    }
}
