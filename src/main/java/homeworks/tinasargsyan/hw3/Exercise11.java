package homeworks.tinasargsyan.hw3;
/*
Given a string and a second "word" string,
we'll say that the word matches the string
if it appears at the front of the string,
except its first char does not need to match exactly.
On a match, return the front of the string,
or otherwise return the empty string.
So, with the string "hippo" the word "hi" returns "hi"//
and "xip" returns "hip". The word will be at least length 1.
 */
public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(matchChar("hippo","hi"));
        System.out.println(matchChar("hippo","xip"));
    }

    public static String matchChar(String str, String word){
        if(str.length() >= word.length() &&
                str.substring(1, word.length()).equals(word.substring(1)))
            return str.substring(0, word.length());
        return "";
    }
}
