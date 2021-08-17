package homeworks.koryun.grigoryan.homework3;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println(generateString("hello"));
        System.out.println(generateString("mountain"));
        System.out.println(generateString("a"));
        System.out.println(generateString("ab"));
    }
    public static String generateString(String str){
        if (str.length()<2){
            return str+str+str;
        }
        return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
    }
}
