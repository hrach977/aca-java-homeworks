package homeworks.robert.mkhitaryan.homework3;

public class Exercise23 {
//    Return true if the string "cat" and "dog" appear the same number of times in the given string.
    public static boolean isAnimalsAppearTheSameNumberOfTimes(String string) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < string.length() - 2; i++) {
            if (string.charAt(i) == 'c' && string.charAt(i + 1) == 'a' && string.charAt(i + 2) == 't') {
                catCount++;
            } else if (string.charAt(i) == 'd' && string.charAt(i + 1) == 'o' && string.charAt(i + 2) == 'g') {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }
    public static void main(String[] args) {
        System.out.println(isAnimalsAppearTheSameNumberOfTimes("cataaadogdogddogcatccat"));
        System.out.println(isAnimalsAppearTheSameNumberOfTimes("cataaadogdogddogcaccat"));
        System.out.println(isAnimalsAppearTheSameNumberOfTimes(""));
    }
}
