package homeworks.Lilit.Levonyan;

public class ex17 {
    public static void main(String[] args) {
        myStr("Hello");
    }
    public static void myStr(String str){
        String str1 = "";
        for(int i = 1; i <= str.length(); i++){
            str1 += str.substring(i-1, i) + str.substring(i-1, i);
        }
        System.out.println(str1);
    }
}
