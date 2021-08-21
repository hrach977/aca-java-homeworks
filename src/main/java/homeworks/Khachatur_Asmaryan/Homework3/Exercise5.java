package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise5 {
    public static String makeOutik(String word, boolean front) {
        return front ? word.charAt(0) + "" : word.charAt(word.length()-1) + "";
    }
}
