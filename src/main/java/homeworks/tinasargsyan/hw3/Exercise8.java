package homeworks.tinasargsyan.hw3;
/*
Given 2 string a and b,
return a new string made of the first char of a and the last char of b.
So, “yo” and “java” yields “ya”.
If either string is length 0, use ‘@’ for its missing char.
 */
public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(firstLastChar("","four"));
        System.out.println(firstLastChar("One","Two"));

    }

    public static String firstLastChar(String str1, String str2) {
        if(str1.length()==0){
            str1 = "@";
        }
        if(str2.length()==0){
            str2 = "@";
        }
        String concat = (str1.substring(0,1)) + (str2.substring(str2.length()-1,str2.length()));
        return concat;
    }

}
