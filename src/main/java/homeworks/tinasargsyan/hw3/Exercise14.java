package homeworks.tinasargsyan.hw3;
/*
Given a string, return a version without the first and last char,
so "Hello" yields "ell".
The string length will be at least 2.
 */
public class Exercise14 {
    public static void main(String[] args) {
        System.out.println(withoutChar("hello"));
        System.out.println(withoutChar("georg"));
    }
    public static String withoutChar(String str){
        if(str.length()>=2){
            return  str.substring(1,str.length()-1);
        }
        return str;
    }
}
