package homeworks.artur.danielyan;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter month");
        String month = input.nextLine();

        if(!(month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December") || month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November") || month.equals("February"))){
            System.out.println("invalid month");
        }else {

            System.out.println("Please enter year");
            int year = input.nextInt();
            if (month.equals("February")) {
                if (year % 4 == 0) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            } else if (month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December")) {
                System.out.println(31);
            } else {
                System.out.println(30);
            }
        }

    }
}
