package homeworks.koryun.grigoryan.homework3;

import java.util.Locale;

public class Ex21 {
    public static void main(String[] args) {
        System.out.println(endsWith("bye", "hellobye"));
        System.out.println(endsWith("b", "abba"));
        System.out.println(endsWith("hellobye", "bye"));

    }
    public static boolean endsWith(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        return str1.endsWith(str2) || str2.endsWith(str1);
    }
}
