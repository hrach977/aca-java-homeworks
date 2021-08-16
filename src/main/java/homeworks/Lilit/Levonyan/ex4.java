package homeworks.Lilit.Levonyan;

public class ex4 {
    public static void main(String[] args) {
        concStr("Hello", "World");
    }
    public static void concStr(String str1, String str2){
        str1 = str1.substring(1,str1.length());
        str2 = str2.substring(1,str2.length());
        String str3 = str1 + str2;
        System.out.println(str3);
    }
}
