package homeworks.koryun.grigoryan.homework3;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(concat("abc", "def"));
    }

    public static String concat(String str1, String str2){
        return str1.substring(1,str1.length())+str2.substring(1, str2.length());
    }
}
