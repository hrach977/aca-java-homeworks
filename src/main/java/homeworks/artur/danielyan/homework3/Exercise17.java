package homeworks.artur.danielyan.homework3;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.println(doubleChars("Artur"));
        System.out.println(doubleChars("a"));
        System.out.println(doubleChars(""));
    }

    public static String doubleChars(String str){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            result.append(str.charAt(i));
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
