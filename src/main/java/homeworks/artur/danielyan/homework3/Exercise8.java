package homeworks.artur.danielyan.homework3;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(fromEdges("yo", "java"));
        System.out.println(fromEdges("yo", ""));
        System.out.println(fromEdges("", "java"));
        System.out.println(fromEdges("", ""));
    }

    public static String fromEdges(String str1, String str2){
        return ( ((str1.length() == 0) ? "@" : String.valueOf(str1.charAt(0))) + ((str2.length() == 0) ? "@" : String.valueOf(str2.charAt(str2.length()-1)))  );
    }
}
