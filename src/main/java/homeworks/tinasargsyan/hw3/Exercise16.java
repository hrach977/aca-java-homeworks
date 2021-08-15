package homeworks.tinasargsyan.hw3;
/*
Given a string, return a version
without both the first and last char of the string.
The string may be any length, including 0.
 */
public class Exercise16 {
    public static void main(String[] args) {
        System.out.println(flChar("ABC"));
        System.out.println(flChar("spring"));
        System.out.println(flChar("a"));
    }

    public static String flChar(String str){
        if (str.length() < 3) {
            return "";
        }
        return str.substring(1,str.length()-1);

    }
}
