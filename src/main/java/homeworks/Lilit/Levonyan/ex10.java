package homeworks.Lilit.Levonyan;

public class ex10 {
    public static void main(String[] args) {
        System.out.println(stringx3("hello"));
    }
    public static String stringx3(String str){
        if(str.length()>=2){
            str = str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        }else{
            str = str + str + str;
        }
        return str;
    }
}
