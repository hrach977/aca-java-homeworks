package homeworks.artur.danielyan.homework3;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.println(removeEdges("Hello"));
        System.out.println(removeEdges("Hi"));
    }

    public static String removeEdges(String str){
        return str.substring(1,str.length()-1);
    }
}
