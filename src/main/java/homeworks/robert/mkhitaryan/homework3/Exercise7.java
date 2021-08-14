package homeworks.robert.mkhitaryan.homework3;

public class Exercise7 {
//    Given a string of odd length, return the string length 3 from its middle. So “Candy” yields “and”.
//    The string length will be at least 3.
    public static String getTheStringLengthThreeFromItsMiddle (String string) {
        int length = string.length();
        return length < 3 || length % 2 == 0 ? "" : string.substring((length- 3 ) / 2, (length- 3) / 2 + 3);
    }
    public static void main(String[] args) {
        System.out.println(getTheStringLengthThreeFromItsMiddle("Candy"));
        System.out.println(getTheStringLengthThreeFromItsMiddle("HelloCandyWorld"));
        System.out.println(getTheStringLengthThreeFromItsMiddle("and"));
        System.out.println(getTheStringLengthThreeFromItsMiddle("HelloCandyWorlda"));
        System.out.println(getTheStringLengthThreeFromItsMiddle("an"));
        System.out.println(getTheStringLengthThreeFromItsMiddle(""));
    }
}
