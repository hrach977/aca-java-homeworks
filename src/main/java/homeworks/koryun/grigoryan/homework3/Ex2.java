package homeworks.koryun.grigoryan.homework3;


public class Ex2 {
    public static void main(String[] args) {
        System.out.println(func("<<>>", "John"));
    }

    public static String func(String str, String word){
        return str.substring(0,2) + word+str.substring(2,4);
    }

}
