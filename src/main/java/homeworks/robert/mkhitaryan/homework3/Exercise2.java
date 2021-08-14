package homeworks.robert.mkhitaryan.homework3;

public class Exercise2 {
//    Given an out string length4, e.g. “<<>>” and a word, return a new string where the word is in
//    the middle of the out string, e.g. “<<word>>”.
//    Note: you can use String::substring(i, j) to extract the String starting at index i and going up to
//    but not including index j.
    public static String putTheWordInTheMiddleOfTheOut(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }
    public static void main(String[] args) {
        System.out.println(putTheWordInTheMiddleOfTheOut("<<>>", "Hello"));
        System.out.println(putTheWordInTheMiddleOfTheOut("{{}}", "Bye"));
    }
}
