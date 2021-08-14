package homeworks.artur.danielyan.homework3;

import java.lang.ref.SoftReference;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.println(nRepetitionOfLastN("Artur", 2));
        System.out.println(nRepetitionOfLastN("Artur", 5));
    }

    public static String nRepetitionOfLastN(String str, int n){
        StringBuilder result = new StringBuilder();
        for(int i = str.length() - n; i < str.length(); i++){
            result.append( str.substring(str.length()-n) );
        }
        return result.toString();
    }
}
