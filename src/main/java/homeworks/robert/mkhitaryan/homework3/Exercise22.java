package homeworks.robert.mkhitaryan.homework3;

public class Exercise22 {
//    We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
//    somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance
//    multiple 'x's. Return true if the given string is xy-balanced.
    public static boolean isXYBalanced(String string) {
        if (!string.contains("x") || !string.contains("y")) {
            return false;
        }
        for (int i = string.length() - 1; i > 0; i--) {
            if (string.charAt(i) == 'y') {
                return true;
            } else if (string.charAt(i)  == 'x') {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isXYBalanced("xxy"));
        System.out.println(isXYBalanced("xyx"));
        System.out.println(isXYBalanced("aya"));
        System.out.println(isXYBalanced("axa"));
        System.out.println(isXYBalanced("aya"));
        System.out.println(isXYBalanced(""));
    }
}
