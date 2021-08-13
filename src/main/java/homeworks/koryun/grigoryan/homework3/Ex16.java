package homeworks.koryun.grigoryan.homework3;

public class Ex16 {
    public static void main(String[] args) {
        System.out.println(generateString(""));
        System.out.println(generateString("a"));
        System.out.println(generateString("aa"));
        System.out.println(generateString("aaa"));
        System.out.println(generateString("aaaa"));

    }
    public static String generateString(String str){
        return str.length()<=2 ? "" : str.substring(1, str.length()-1);
    }
}
