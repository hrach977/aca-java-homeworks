package homeworks.koryun.grigoryan.homework3;

public class Ex15 {
    public static void main(String[] args) {
        System.out.println(rotate("abc"));
        System.out.println(rotate("ab"));
    }
    public static String rotate(String str){
        if (str.length() > 2) {
            return str.substring(2) + str.substring(0, 2);
        }
        return str;
    }
}
