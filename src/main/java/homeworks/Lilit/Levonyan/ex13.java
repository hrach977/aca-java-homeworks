package homeworks.Lilit.Levonyan;

public class ex13 {
    public static void main(String[] args) {
        System.out.println(lastChar("Hello"));
    }
    public static String lastChar(String a){
        return a.substring(a.length()-2 , a.length()) +a.substring(a.length()-2 , a.length()) + a.substring(a.length()-2 , a.length());
    }
}
