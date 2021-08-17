package homeworks.tinasargsyan.hw3;
/*
Given a string and an int n,
return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.
*/
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = sc.nextLine();
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println(repeatEnd(word,number));
    }


    public static String repeatEnd(String str, int n){
//        String newWord = "";
//        for(int i = 0;i<n; i++){
//            newWord += str.substring(str.length()-n);
//        }
//        return newWord;

        String last = str.substring(str.length()-n);
        StringBuilder result = new StringBuilder();
        for(int i=1; i<=n; i++){
            result.append(last);
        }
        return result.toString();
    }
}
