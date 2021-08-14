package homeworks.robert.mkhitaryan.homework3;

public class Exercise10 {
//    Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The
//    string may be any length. If there are fewer than 2 chars, use whatever is there.
    public static String maKeOfThreeCopiesOfTheFirstTwoCharsOfTheString(String string) {
        return string.length() < 3 ?  string + string + string :
                                      string.substring(0, 2) + string.substring(0, 2) + string.substring(0, 2);
    }
    public static void main(String[] args) {
        System.out.println(maKeOfThreeCopiesOfTheFirstTwoCharsOfTheString("abcdefg"));
        System.out.println(maKeOfThreeCopiesOfTheFirstTwoCharsOfTheString("ab"));
        System.out.println(maKeOfThreeCopiesOfTheFirstTwoCharsOfTheString("a"));
        System.out.println(maKeOfThreeCopiesOfTheFirstTwoCharsOfTheString(""));
    }
}
