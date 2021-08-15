package homeworks.tinasargsyan.hw3;
/*
Given a string, return a new string
made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.
 */
public class Exercise13 {
    public static void main(String[] args) {
        System.out.println(lastTwoChars("mark"));
        //System.out.println(lastTwoChars("d"));
    }

    public static String lastTwoChars(String str){
        String str1 = str.substring(str.length()-2,str.length());
            return (str1+str1+str1);
    }
}
