package homeworks.tinasargsyan.hw3;
/*
Given two strings,
return true
if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences
(in other words, the computation should not be "case sensitive").
 */
public class Exercise21 {
    public static void main(String[] args) {
        System.out.println(endString("Good","daygood"));
        System.out.println(endString("hi","byehi"));
    }

    public static boolean endString(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() < str2.length()){
            String tmp = str2.substring(str2.length()-str1.length());
            if(tmp.compareTo(str1)==0){
                return true;
            }return false;
        }else{
            String tmp = str1.substring(str1.length()-str2.length());
            if(tmp.compareTo(str2)==0){
                return true;
            }return false;
        }
    }
}
