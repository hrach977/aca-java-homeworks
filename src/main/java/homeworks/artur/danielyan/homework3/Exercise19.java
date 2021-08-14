package homeworks.artur.danielyan.homework3;

public class Exercise19 {
    public static void main(String[] args) {
        System.out.println(charsAtStars("*a*a something*g something d*d"));//true
        System.out.println(charsAtStars("*a*a something*g something d*h"));//false
        System.out.println(charsAtStars("*a*a something*g something d*h*"));//false
        System.out.println(charsAtStars("NO"));//true
    }

    public static boolean charsAtStars(String str){
        for(int i = 1; i < str.length()-1; i++){
            if((str.charAt(i) == '*') && (str.charAt(i-1) != str.charAt(i+1))){
                return false;
            }
        }
        return true;
    }
}
