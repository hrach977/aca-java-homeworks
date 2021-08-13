package homeworks.koryun.grigoryan.homework3;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(halfOfString("WooHoo"));
    }
    public static String halfOfString(String str){
        return str.substring(0,str.length()/2);
    }
}
