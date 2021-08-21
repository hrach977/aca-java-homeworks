package homeworks.Khachatur_Asmaryan.Homework3;

import java.util.Scanner;

public class Demo {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter word");
            String str = input.nextLine();
            String result = Exercise17.doubleChar(str);
            System.out.println(result);
    }
}
