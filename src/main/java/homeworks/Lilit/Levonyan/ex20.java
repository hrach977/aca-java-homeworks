package homeworks.Lilit.Levonyan;

import java.util.Locale;

public class ex20 {
    public static void main(String[] args) {
        System.out.println(myStr("helohiknowhifdshiHI"));
    }

    public static int myStr(String str) {
        int n = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.toLowerCase(Locale.ROOT).charAt(i) == 'h') && (str.toLowerCase(Locale.ROOT).charAt(i + 1) == 'i')) {
                count += 1;
            }
        }
        return count;
    }
}
