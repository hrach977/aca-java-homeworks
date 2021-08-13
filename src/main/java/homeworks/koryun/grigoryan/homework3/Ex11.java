package homeworks.koryun.grigoryan.homework3;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println(generateString("hippo", "hi"));
        System.out.println(generateString("hippo", "xip"));
        System.out.println(generateString("hippo", "him"));

    }
    public static String generateString(String str, String word){
        for(int i = 1; i<str.length() && i<word.length();i++){
            if(word.charAt(i) != str.charAt(i)){
                return "";
            }
        }
        return str.substring(0,word.length());
    }
}
