package homeworks.artur.danielyan.homework3;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(takeFromEdge("Hello!", false));
    }

    public static String takeFromEdge(String str, boolean front){
        if(front){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1);
    }
}
