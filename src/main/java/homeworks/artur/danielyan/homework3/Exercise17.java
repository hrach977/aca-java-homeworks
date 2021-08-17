package homeworks.artur.danielyan.homework3;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.println(doubleChars("Artur"));
        System.out.println(doubleChars("a"));
        System.out.println(doubleChars(""));
    }

    public static String doubleChars(String str){
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()){
            result.append(ch).append(ch);
        }
        return result.toString();
    }
}
