package homeworks.Khachatur_Asmaryan.Homework3;

import java.util.Scanner;

public class Demo {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter word");
            String word1 = input.nextLine();
            System.out.println("please enter front");
            boolean front = input.nextBoolean();
            String result = Exercise5.makeOutik(word1, front);
            System.out.println(result);
    }
}
