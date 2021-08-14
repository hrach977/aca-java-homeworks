package homeworks.artur.danielyan.homework3;

public class Exercise15 {
    public static void main(String[] args) {
        System.out.println(rotateLeft2("Hello"));
        System.out.println(rotateLeft2("No"));
    }

    public static String rotateLeft2(String str){
        return str.substring(2) + str.substring(0,2);
    }
}
