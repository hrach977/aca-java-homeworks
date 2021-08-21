package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise19 {
    public static boolean sameStartChar(String str) {
        if (!str.contains("*")) {
            return false;
        }
        for (int i=1; i<str.length()-1; i++) {
            if (str.charAt(i)=='*') {
                if (str.charAt(i-1)!=str.charAt(i+1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
