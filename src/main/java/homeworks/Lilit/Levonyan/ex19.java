package homeworks.Lilit.Levonyan;

public class ex19 {
    public static void main(String[] args) {
        System.out.println(myString("hsdfh*hfgrnfdj*jgfdk"));
    }
    public static boolean myString(String str){
        for(int i=1; i < str.length()-1; i++){
            if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}
