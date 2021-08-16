package homeworks.Lilit.Levonyan;

public class ex11 {
    public static void main(String[] args) {
        System.out.println(match("hippo", "xip"));
    }

    public static String match(String a, String b) {
        if(a.substring(1,b.length()).matches(b.substring(1, b.length()))){
            return a.substring(0, b.length());
        }
        return a;
    }
}
