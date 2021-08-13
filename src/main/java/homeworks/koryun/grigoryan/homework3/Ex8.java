package homeworks.koryun.grigoryan.homework3;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println(generateString("yo", "java"));
        System.out.println(generateString("", "java"));
        System.out.println(generateString("java", ""));
    }
    public static String generateString(String a, String b){
        if(a.length()==0){
            a = "@";
        }
        if(b.length() == 0){
            b = "@";
        }
        return ""+a.charAt(0)+b.charAt(b.length()-1);
    }
}
