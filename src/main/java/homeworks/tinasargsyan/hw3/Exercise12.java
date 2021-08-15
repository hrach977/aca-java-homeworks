package homeworks.tinasargsyan.hw3;
/*
Given two strings, a and b,
return the result of putting them together in the order abba,
e.g. "Hi" and "Bye" returns "HiByeByeHi".
 */
public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(strOrder("Hi","Bye"));
        System.out.println(strOrder("Va","lod"));
    }

    public static String strOrder(String str1, String str2){
        String str = str1 + str2 + str2 + str1;
        return str;
    }
}
