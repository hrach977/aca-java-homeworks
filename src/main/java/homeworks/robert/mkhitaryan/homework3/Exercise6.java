package homeworks.robert.mkhitaryan.homework3;

public class Exercise6 {
//    Given a string, return true if it ends in “ly”.
    public static boolean isItEndsIn(String string) {
        return string.endsWith("ly");
    }
    public static void main(String[] args) {
        System.out.println(isItEndsIn("anyStringly"));
        System.out.println(isItEndsIn("lyanyStringlyanyString"));
    }
}
