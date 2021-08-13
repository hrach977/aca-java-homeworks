package homeworks.tinasargsyan.hw3;
/*
Given an out string length 4, e.g. “<<>>” and a word,
return a new string where the word is
in the middle of the out string, e.g. “<<word>>”.
 */
import java.util.Scanner;

public class Exercise2 {
    public static String makeOutWord(String outside, String inside) {
        String str = outside.substring(0, 2) + inside + outside.substring(2, 4);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write THE word ");
        String input = sc.nextLine();
        input = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println(makeOutWord("<<>>",input));
    }
}
