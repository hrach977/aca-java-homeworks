package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise16 {
    public static String makeword(String str) {
        if (str.length()<=2) {
            return " ";
        }
        return str.substring(1, str.length()-1);
    }
}
