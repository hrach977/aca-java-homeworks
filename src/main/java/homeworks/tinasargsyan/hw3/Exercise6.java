package homeworks.tinasargsyan.hw3;
/*
Given a string, return true if it ends in “ly”.
 */
public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(endsWith("lovely"));

    }
    public static boolean endsWith(String str) {
        String end = "ly";
        if (str.length() < 2) {
            return false;
        }
        else if (end.equals(str.substring(str.length()-2,str.length()))) {
            return true;
        }
        else
        return false;
    }

}
