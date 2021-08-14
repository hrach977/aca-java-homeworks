package homeworks.robert.mkhitaryan.homework3;

import java.util.Locale;

public class Exercise21 {
//    Given two strings, return true if either of the strings appears at the very end of the other string,
//    ignoring upper/lower case differences (in other words, the computation should not be "case
//    sensitive").
    public static boolean isAppearAtTheVeryEnd(String firstString, String secondString) {
        return firstString.toLowerCase().endsWith(secondString) || secondString.toLowerCase().endsWith(firstString);
    }
    public static void main(String[] args) {
        System.out.println(isAppearAtTheVeryEnd("aaabbb","cccaaabbb"));
        System.out.println(isAppearAtTheVeryEnd("cccaaabbb","aaabbb"));
        System.out.println(isAppearAtTheVeryEnd("aaa","cccaaabbb"));
        System.out.println(isAppearAtTheVeryEnd("cccaaabbb","aaa"));
    }
}
