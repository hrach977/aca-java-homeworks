package solution2;


import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter = input.next();
        letter = letter.toLowerCase();
        int len = letter.length();

        if (len == 1) {
            char single = letter.charAt(0);
            boolean isLetter = single >= 97 && single <= 122;
            if (isLetter) {
                if (single == 'a' || single == 'e' || single == 'i'
                        || single == 'o' || single == 'u' || single == 'y') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("not a letter");
            }
        } else {
            System.out.println("not a single symbol");
        }

    }

}
