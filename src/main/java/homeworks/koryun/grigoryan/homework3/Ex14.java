package homeworks.koryun.grigoryan.homework3;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println(generateString("hello"));
        System.out.println(generateString("he"));
        System.out.println(generateString("really"));
    }
    public static String generateString(String str){
        return str.substring(1,str.length()-1);
    }
}
