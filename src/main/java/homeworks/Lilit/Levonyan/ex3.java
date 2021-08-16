package homeworks.Lilit.Levonyan;

public class ex3 {
    public static void main(String[] args) {
        System.out.println(halfString("WooHoo"));
    }
    public static String halfString(String half){
        return half.substring(0, half.length() / 2);
    }
}
