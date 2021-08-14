package homeworks.robert.mkhitaryan.homework3;

public class Exercise19 {
//    Write a method that returns true if for every '*' (star) in the string,if there are chars both
//    immediately before and after the star, they are the same.
    public static boolean areTheyTheSame (String string) {
        if (!string.contains("*") || string.charAt(0) == '*' || string.charAt(string.length() - 1) == '*') {
            return false;
        }
        for (int i = 1; i < string.length() - 1; i++) {
            if (string.charAt(i) == '*' && !(string.charAt(i - 1) == string.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(areTheyTheSame("a*ab*bb*bcc*c"));
        System.out.println(areTheyTheSame("a*ab*bc*bcc*c"));
        System.out.println(areTheyTheSame("a*ab***bcc*c"));
        System.out.println(areTheyTheSame("*a*ab*bb*bcc*c"));
        System.out.println(areTheyTheSame("a*ab*bb*bcc*c*"));
        System.out.println(areTheyTheSame("aabbbbccc"));
        System.out.println(areTheyTheSame(""));
    }
}
