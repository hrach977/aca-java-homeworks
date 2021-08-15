package homeworks.tinasargsyan.hw3;
/*
Given a string, return a "rotated left 2" version
where the first 2 chars are moved to the end.
The string length will be at least 2.
 */
public class Exercise15 {
    public static void main(String[] args) {
        System.out.println(rotatedLeft("ayyesterd"));
        System.out.println(rotatedLeft("java"));
    }

    public static String rotatedLeft(String str){
        return str.substring(2,str.length())+str.substring(0,2);
    }
}
