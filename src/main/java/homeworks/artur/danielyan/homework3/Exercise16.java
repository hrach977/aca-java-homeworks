package homeworks.artur.danielyan.homework3;

public class Exercise16 {
    public static void main(String[] args) {
        System.out.println(removeEdges("Hello"));
        System.out.println("1 " + removeEdges("Hi"));
        System.out.println("2 " + removeEdges("k"));
        System.out.println("3 " + removeEdges(""));
    }

    public static String removeEdges(String str){
        if (str.length() < 2) return "";
        return str.substring(1,str.length()-1);
    }
}
