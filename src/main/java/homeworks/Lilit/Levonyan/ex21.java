package homeworks.Lilit.Levonyan;

public class ex21 {
    public static void main(String[] args) {
        System.out.println(myString("gallery", "mix"));
    }
    public static boolean myString(String str1, String str2){
        if(str1.toLowerCase().endsWith(str2)){
            return true;
        }else if(str2.toLowerCase().endsWith(str1)){
            return true;
        }else{
            return false;
        }
    }
}
