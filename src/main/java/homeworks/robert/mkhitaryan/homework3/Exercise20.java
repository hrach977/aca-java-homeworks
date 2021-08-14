package homeworks.robert.mkhitaryan.homework3;

public class Exercise20 {
//    Return the number of times that the string "hi" appears anywhere in the given string.
    public static int getCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == 'h' && string.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getCount("hi"));
        System.out.println(getCount("hihi"));
        System.out.println(getCount("hiaaahibbbhi"));
        System.out.println(getCount("haaahibbbi"));
        System.out.println(getCount(""));
    }
}
