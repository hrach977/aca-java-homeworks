package homeworks.Lilit.Levonyan;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(myWord("word"));
    }
    public static String myWord(String word){
        String outWord = "<<>>";
        return outWord.substring(0,2) + word + outWord.substring(2,4);
    }
}
