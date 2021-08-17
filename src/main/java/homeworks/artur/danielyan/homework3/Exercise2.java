package homeworks.artur.danielyan.homework3;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(putIn("1515","yes"));
    }

    public static String putIn(String out, String word){
        return out.substring(0,2) + word + out.substring(2);
    }
}
