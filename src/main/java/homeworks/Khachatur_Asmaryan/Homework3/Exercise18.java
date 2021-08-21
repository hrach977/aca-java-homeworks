package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise18 {
    public static String repeatEnd(String str, int n) {
        String last = str.substring(str.length()-n);
        StringBuilder result = new StringBuilder();
        for (int i=1; i<=n; i++) {
            result.append(last);
        }
        return result.toString();
    }
}
