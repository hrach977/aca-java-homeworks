package homeworks.robert.mkhitaryan.homework3;

public class Exercise11 {
//    Given a string and a second "word" string, we'll say that the word matches the string if it appears
//    at the front of the string, except its first char does not need to match exactly.On a match, return
//    the front of the string, or otherwise return the empty string. So, with the string "hippo" the word
//    "hi" returns "hi"// and "xip" returns "hip". The word will be at least length 1.
    public static String isMatch(String string, String word) {
        if (string.startsWith(word)) {
            return word;
        } else if (string.substring(1).startsWith(word.substring(1))) {
            return string.charAt(0) + word.substring(1);
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(isMatch("hippo", "hi"));
        System.out.println(isMatch("hippo", "xip"));
        System.out.println(isMatch("", ""));
    }
}
