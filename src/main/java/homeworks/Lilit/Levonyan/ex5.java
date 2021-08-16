package homeworks.Lilit.Levonyan;

public class ex5 {
    public static void main(String[] args) {
        myWord(false, "Jujutsu");
    }

    public static void myWord(boolean front, String word) {
        if(front){
            System.out.println(word.substring(0,1));
        }else{
            System.out.println(word.substring(word.length()-1,word.length()));
        }

    }
}
