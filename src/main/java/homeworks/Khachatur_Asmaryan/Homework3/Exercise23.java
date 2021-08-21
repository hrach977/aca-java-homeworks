package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise23 {
    public static boolean catDog(String str) {
        int count1 = 0;
        int count2 = 0;
        for (int i=0; i<str.length()-2; i++) {
            if (str.startsWith("cat", i)) {
                count1++;
                i+=2;
            }else if (str.startsWith("dog", i)) {
                count2++;
                i+=2;
            }
        }
        return count1 == count2;
    }
}
