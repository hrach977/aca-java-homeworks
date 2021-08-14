package homeworks.artur.danielyan.homework3;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(matches("hippo", "hi"));
        System.out.println(matches("hippo", "xip"));
        System.out.println(matches("hippo", "no"));
        System.out.println(matches("hippo", "big length"));
        System.out.println(matches("hippo", "hippo"));
        System.out.println(matches("hippo", "hello"));
    }

    public static String matches(String str, String word){
        if(word.length()>str.length()) return "";
        if(str.substring(1,word.length()).equals(word.substring(1))) return  word;
        return "";
    }
}
