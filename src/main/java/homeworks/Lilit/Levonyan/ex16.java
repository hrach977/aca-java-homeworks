package homeworks.Lilit.Levonyan;

public class ex16 {
    public static void main(String[] args) {
        System.out.println(myStr(""));
    }
    public static String myStr(String str){
        if (str.length()>=2) {
            return str.substring(1, str.length() - 1);
        }else{
            return "";
        }
    }
}
