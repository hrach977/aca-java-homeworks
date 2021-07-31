package homeworks.artur.danielyan;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String month = input.nextLine();
        if(!(month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December") || month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November") || month.equals("February"))){
            System.out.println("invalid month");
        }else{
            int year = input.nextInt();
            switch (month){
                case "February": {
                    if(year%4 == 0){
                        System.out.println(29);
                    }else {
                        System.out.println(28);
                    }
                    break;
                }
                case "January":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                {
                    System.out.println(31);
                    break;
                }
                default: {
                    System.out.println(30);
                }
            }
        }
    }
}
