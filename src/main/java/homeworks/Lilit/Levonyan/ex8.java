package homeworks.Lilit.Levonyan;

public class ex8 {
    public static void main(String[] args) {
        System.out.println(myWord("yo", "Java"));
    }
    public static String myWord(String a, String b){
        String c;
        if( a.length()>= 1 && b.length() >= 1){
            c = a.substring(0,1) + b.substring(b.length()-1, b.length());
        }else if(a.length() < 1){
            c = "@" + b.substring(b.length()-1, b.length());
        }else if(b.length() < 1){
            c = a.substring(0,1) + "@";
        }else{
            c = "@" + "@";
        }
        return c;
    }
}
