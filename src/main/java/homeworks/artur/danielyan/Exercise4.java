package homeworks.artur.danielyan;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a single letter");
        String str = input.nextLine();
        if(str.length() > 1){
            System.out.println("Error. Not a single character.");
        }else{
            char ch = str.charAt(0);
            if( (ch>=65 && ch<=90) || (ch>=97 && ch<=122) ){
                int v1 = 65;
                int v2 = 69;
                int v3 = 73;
                int v4 = 79;
                int v5 = 85;
                if((ch == v1 || ch == v1 + 32) || (ch == v2 || ch == v2 + 32) || (ch == v3 || ch == v3 + 32) || (ch == v4 || ch == v4 + 32) || (ch == v5 || ch == v5 + 32) ){
                    System.out.println("Vowel");
                }else{
                    System.out.println("Consonant");
                }
            }else{
                System.out.println("Error. Not a letter.");
            }
        }
    }
}
