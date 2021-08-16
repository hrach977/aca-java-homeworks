package homeworks.Lilit.Levonyan;

public class ex7 {
    public static void main(String[] args) {
        medWord("Candy");
    }
    public static void medWord(String word){
        int n = word.length()/2;
        System.out.println(word.substring(n-1,n+2));
    }
}
