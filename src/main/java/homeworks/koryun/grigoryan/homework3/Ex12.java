package homeworks.koryun.grigoryan.homework3;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println(generateString("Hello", "Bye"));
    }
    public static String generateString(String a, String b){
        return a+b+b+a;
    }
}
