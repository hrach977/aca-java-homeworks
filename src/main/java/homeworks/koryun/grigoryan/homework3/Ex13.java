package homeworks.koryun.grigoryan.homework3;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println(generateString("hello"));
        System.out.println(generateString("ol"));
        System.out.println(generateString("maybe"));

    }
    public static String generateString(String str){
        String substring = str.substring(str.length() - 2);
        return substring + substring + substring;
    }
}
