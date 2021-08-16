package homeworks.Lilit.Levonyan;

public class ex15 {
    public static void main(String[] args) {
        System.out.println(myStr("Hello"));
    }
    public static String myStr(String str){
        return str.substring(2,str.length()) + str.substring(0,2);
    }
}
