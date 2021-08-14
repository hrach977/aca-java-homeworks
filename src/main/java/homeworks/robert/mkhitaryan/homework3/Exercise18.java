package homeworks.robert.mkhitaryan.homework3;

import java.sql.Statement;

public class Exercise18 {
//    Given a string and an int n, return a string made of n repetitions of the last n characters of the
//    string.You may assume that n is between 0 and the length of the string, inclusive.
    public static String makeOfNRepetitionsOfTheLastNCharacters (String string, int n) {
        return n <= 0 || n > string.length() ? "" : string.substring(string.length() - n).repeat(n);
    }
    public static void main(String[] args) {
        System.out.println(makeOfNRepetitionsOfTheLastNCharacters("abcdefg", 3));
        System.out.println(makeOfNRepetitionsOfTheLastNCharacters("abcdefg", 7));
        System.out.println(makeOfNRepetitionsOfTheLastNCharacters("abcdefg", 8));
        System.out.println(makeOfNRepetitionsOfTheLastNCharacters("abcdefg", 0));
        System.out.println(makeOfNRepetitionsOfTheLastNCharacters("abcdefg", -1));
    }
}
