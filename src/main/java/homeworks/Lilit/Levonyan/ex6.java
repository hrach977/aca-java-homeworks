package homeworks.Lilit.Levonyan;

public class ex6 {
    public static void main(String[] args) {
        endsWith("lovely");
    }
    public static void endsWith(String word){
        if(word.endsWith("ly")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
