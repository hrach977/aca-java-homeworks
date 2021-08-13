package homeworks.artur.danielyan.homework3;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(clearFirstChars("Hello ","World!"));
    }

    public static String clearFirstChars(String str1, String str2){
        return str1.substring(1) + str2.substring(1);
    }
}
