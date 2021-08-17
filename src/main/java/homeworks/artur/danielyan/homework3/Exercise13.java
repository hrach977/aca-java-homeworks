package homeworks.artur.danielyan.homework3;

public class Exercise13 {
    public static void main(String[] args) {
        System.out.println(threeOfLastTwo("Hello"));
        System.out.println(threeOfLastTwo("Hi"));
    }

    public static String threeOfLastTwo(String str){
        String substring = str.substring(str.length()-2);
        return substring + substring + substring;
    }
}
