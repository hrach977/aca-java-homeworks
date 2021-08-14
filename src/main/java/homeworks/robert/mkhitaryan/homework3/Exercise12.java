package homeworks.robert.mkhitaryan.homework3;

public class Exercise12 {
//    Given two strings, a and b,return the result of putting them together in the order abba, e.g. "Hi"
//    and "Bye" returns "HiByeByeHi".
    public static String  putTogetherInTheOrderAbbA(String a, String b) {
        return a + b + b + a;
    }
    public static void main(String[] args) {
        System.out.println(putTogetherInTheOrderAbbA("Hi", "Bye"));
        System.out.println(putTogetherInTheOrderAbbA("", ""));
    }
}
