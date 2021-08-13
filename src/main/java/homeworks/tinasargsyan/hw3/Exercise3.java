package homeworks.tinasargsyan.hw3;
/*
Given a string of even length,
return the first half of the string.
So the string “WooHoo” yields “Woo”.
 */
public class Exercise3 {
    public static void main(String[] args) {
        String theWord1 = "WooHoo";
        String theWord2 = "HooHoo";
        String halfWord1 = half(theWord1);
        String halfWord2 = half(theWord2);
        System.out.println(halfWord1);
        System.out.println(halfWord2);
    }

    public static String half(String word){
        String halfOfWord = word.substring(0,word.length()/2);
        return halfOfWord;
    }
}
