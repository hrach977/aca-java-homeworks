package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise17 {
    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) { //char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
            result.append(ch).append(ch);
        }
        return result.toString();
    }
}