package homeworks.Lilit.Levonyan;

public class ex18 {
    public static void main(String[] args) {
        myStr("Hello",4 );

    }

    public static void myStr(String str, int n) {
        String str1 = "";
        String str2 = "";
        String str3 = "";
        str = str.substring(str.length()-n,str.length());
        for(int i = 1; i<= n; i++){
            str1 = str.substring(i-1,i);
            for(int k = 1; k<= n; k++){
                str2 += str1;
            }
        }
        System.out.println(str2);

    }
}
