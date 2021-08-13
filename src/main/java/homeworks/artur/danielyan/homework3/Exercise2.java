package homeworks.artur.danielyan.homework3;

public class Exercise2 {
    public static void main(String[] args) {
        String str = "Hello!";
        String extract = str.substring(0,3);
        System.out.println(putIn("1515","yes"));
    }

    public static String putIn(String out, String word){
        if(out.length() != 4){
            System.out.println("Out String length must be 4");
            return "";
        }
        return out.substring(0,2) + word + out.substring(2);
    }
}
