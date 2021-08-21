package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise14 {
    public static String catword(String word) {
        if (word.length()< 2) {
            return " ";
        }
        return word.substring(1, word.length()-1);
    }
}
