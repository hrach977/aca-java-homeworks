package homeworks.artur.danielyan;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter month");
        String month = input.nextLine();
        System.out.println("Please enter year");
        int year = input.nextInt();
        month = month.toLowerCase();
        if(month.equals("january") || month.equals("february") || month.equals("march") || month.equals("april") || month.equals("may") || month.equals("june") || month.equals("july") || month.equals("august") || month.equals("september") || month.equals("october") || month.equals("november") || month.equals("december")){
            if(month.equals("january") || month.equals("march") || month.equals("may") || month.equals("july") || month.equals("august") || month.equals("october") || month.equals("december")){
                System.out.println(31);
            }else if (month.equals("february")){
                boolean first = (year % 4 == 0) && (year % 100 != 0);
                boolean second = year % 400 == 0;
                if (first || second) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            }else{
                System.out.println(30);
            }
        }else{
            System.out.println("Invalid month");
        }
    }
}
