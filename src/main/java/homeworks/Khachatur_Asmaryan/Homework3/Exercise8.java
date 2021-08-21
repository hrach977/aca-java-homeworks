package homeworks.Khachatur_Asmaryan.Homework3;

import java.util.Scanner;

public class Exercise8 {
    public static String makeword(String a, String b) {
        char first = a.length()>0 ? a.charAt(0) : '@';
        char second = b.length()>0 ? b.charAt(b.length()-1) : '@';
        return first + "" + second;
    }
}
