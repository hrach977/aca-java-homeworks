package homeworks.artur.danielyan.homework3;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(fromMiddle("Candy"));
    }

    public static String fromMiddle(String str){
        if(str.length()%2 != 1){
            System.out.println("Given String length must be odd");
            return "";
        }
        return str.substring(str.length()/2 - 1, str.length() - str.length()/2 + 1);
    }
}
