package homeworks.Lilit.Levonyan;

public class ex22 {
    public static void main(String[] args) {
        System.out.println(myString("4yxt3ynh"));
    }
    public static boolean myString(String str){
        if(str.lastIndexOf("x") < str.lastIndexOf("y")){
            return true;
        }else{
            return false;
        }
    }
}
