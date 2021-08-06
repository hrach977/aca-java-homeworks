package homeworks.Khachatur_Asmaryan.Homework2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a single letter");
        String str = input.nextLine();
        str = str.toLowerCase();
        if(str.length() > 1){
            System.out.println("Error. Not a single character.");
        }else{
            char ch = str.charAt(0);
            if( (ch>=97 && ch<=122) ){
                if(ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117){
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

