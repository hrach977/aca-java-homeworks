package homeworks.koryun.grigoryan.homework3;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println(endsWith("quickly"));
        System.out.println(endsWith("lyquick"));
        System.out.println(endsWith("quilyck"));
        System.out.println(endsWith("q"));
    }
    public static boolean endsWith(String str){
        return str.endsWith("ly");
    }
}
