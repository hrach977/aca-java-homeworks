package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise20 {
    public static int countHi(String str) {
        int count = 0;
        for (int i=0; i<str.length()-1; i++) {
            if (str.startsWith("hi", i)) {
                count++;
                i++;
            }
        }
        return count;
    }
}
