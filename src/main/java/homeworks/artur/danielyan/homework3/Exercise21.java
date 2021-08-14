package homeworks.artur.danielyan.homework3;

import java.util.Locale;

public class Exercise21 {
    public static void main(String[] args) {
        System.out.println(mathchesEnds("Artur","ur"));
        System.out.println(mathchesEnds("lo","Hello"));
        System.out.println(mathchesEnds("Hello ","World"));
    }

    public static boolean mathchesEnds(String str1, String str2){
        String string1 = str1.toLowerCase();
        String string2 = str2.toLowerCase();//hello he
        return string1.endsWith(string2) || string2.endsWith(string1);
    }
}
