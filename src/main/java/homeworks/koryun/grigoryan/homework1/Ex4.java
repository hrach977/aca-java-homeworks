package homeworks.koryun.grigoryan.homework1;
import java.util.Scanner;
import java.lang.Character;
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if (!Character.isLetter(str.charAt(0))){
            System.out.println("Error: Not a letter");
        }else if(str.length()>1){
            System.out.println("Error: Not a single letter");
        }else if("a".equals(str)){
            System.out.println("vowel");
        }else if("e".equals(str)){
            System.out.println("vowel");
        }else if("i".equals(str)){
            System.out.println("vowel");
        }else if("o".equals(str)){
            System.out.println("vowel");
        }else if("u".equals(str)){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}
