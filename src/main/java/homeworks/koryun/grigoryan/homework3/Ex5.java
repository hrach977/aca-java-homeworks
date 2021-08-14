package homeworks.koryun.grigoryan.homework3;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(generateString(true, "absabas"));
        System.out.println(generateString(false, "fsdghfwe"));
    }
    public static String generateString(boolean front, String str){
        return front ? str.charAt(0)+"" : str.charAt(str.length()-1)+"";
    }
}
