package notepad;

public class Exam1 {
    public static void main(String[] args) {
        String r = words("I Love You!");
        System.out.println(r);

    }
    public static String words(String s){
        char[] letters = new char[s.length()];

        int letterIndex = 0;
        for(int i = s.length() -1; i>=0; i--){
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        String words = "";

        for(int i = 0; i<s.length(); i++){
            words += letters[i];
        }
        return words;
    }

}
