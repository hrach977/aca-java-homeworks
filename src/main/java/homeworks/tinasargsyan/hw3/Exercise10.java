package homeworks.tinasargsyan.hw3;
/*
Given a string,
return a new string made of 3 copies of the first 2 chars of the original string.
The string may be any length.
If there are fewer than 2 chars, use whatever is there.
 */
public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(strCopy("String"));
        System.out.println(strCopy("ev"));
        System.out.println(strCopy("b"));
    }

    public static String strCopy(String str){
        if(str.length()>2){
            String str1 = str.substring(0,2);
            return str1 + str1 + str1;
        }
        return str+ str + str;
    }
}
