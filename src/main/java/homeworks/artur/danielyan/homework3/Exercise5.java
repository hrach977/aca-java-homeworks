package homeworks.artur.danielyan.homework3;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(takeFromEdge("Hello!", false));
    }

    public static String takeFromEdge(String str, boolean front){
        return (front) ? str.substring(0,1) : str.substring(str.length()-1);
    }
}
