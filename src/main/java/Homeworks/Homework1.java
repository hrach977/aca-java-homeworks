package Homeworks;

import java.util.*;

public class Homework1 {
    public static void main(String[] args) {
        //           Exercise 1
        // Take a number from input between 1-7. Output the corresponding day of week.
      /* Scanner input = new Scanner(System.in);
        System.out.println("Please input number");
       int a = input.nextInt();
       if(a == 1){
           System.out.println("Monday");
       }else if(a == 2){
           System.out.println("Tuesday");
       }else if(a == 3){
           System.out.println("Wednesday");
       }else if(a == 4){
           System.out.println("Thursday");
       }else if(a == 5){
           System.out.println("Friday");
       }else if(a == 6){
           System.out.println("Saturday");
       }else if(a == 7){
           System.out.println("Sunday");
       }
       else{
           System.out.println("Invalid day range");
       }*/


//                Exercise 2
// Solve exercise1 using switch statement
  /*  Scanner input = new Scanner(System.in);
        System.out.println("Please input number");
    int a = input.nextInt();
    switch(a){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("invalid day range");
    }*/


//             Exercise 3
// Solve exercise1 using switch statement.


       /* Scanner input = new Scanner(System.in);
        System.out.println("PLease input first number");
        double a = input.nextDouble();
        System.out.println("PLease input second number");
        double b = input.nextDouble();
        int num1 = (int)(a*1000);
        int num2 = (int)(b*1000);

        if(num1 == num2){
            System.out.println("They are the same up to three decimal places");
        } else{
            System.out.println("They are different");
        }*/


//             Exercise 4
//Take two floating point numbers from input. Check whether they are the same up to three decimal places


       /* Scanner input = new Scanner(System.in);
        System.out.println("PLease input a character");
        String str = input.nextLine();
        if (str.length() > 1) {
            System.out.println("Error. not a single character");
        } else {
            char ch = str.charAt(0);
            if (ch >= 65 && ch <= 90) {
                System.out.println("Consonant");
            } else if (ch >= 97 && ch <= 122) {
                System.out.println("Vowel");
            } else {
                System.out.println("Error, Not a Letter");
            }
        }*/



//                Exercise 5
//Take a year from input. Output whether that year is a leap year or not.

       /* Scanner input = new Scanner(System.in);
        System.out.println("Please input a year");
        int a = input.nextInt();
        if(a % 4 == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        } */

//                Exercise 6
//Take two integers from input between 25 and 75. Output true if there’s a common digit in both numbers.
       /* Scanner input = new Scanner(System.in);
        System.out.println("Please input first number");
        String a = input.nextLine();
        System.out.println("Please input second number");
        String b = input.nextLine();
        char first = a.charAt(0);
        char second = a.charAt(1);
        char third = b.charAt(0);
        char fourth = b.charAt(1);
        if((first == third) || (first == fourth)){
            System.out.println("true");
        }else if((second == third) || (second == fourth)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/


//              Exercise 7
//Take two numbers from input. Output true if one of them is 10 or if their sum is 10

       /* Scanner input = new Scanner(System.in);
        System.out.println("PLease input first number");
        int a = input.nextInt();
        System.out.println("PLease input second number");
        int b = input.nextInt();
        if((a == 10 || b == 10) || (a + b == 10)){
            System.out.println("true");
        }else{
            System.out.println("false");
        } */



//          Exercise 8
//Take two integers from input. Output true if either of them is in the range 10..20 inclusive.

       /* Scanner input = new Scanner(System.in);
        System.out.println("Please input first number");
        int a =input.nextInt();
        System.out.println("Please input second number");
        int b = input.nextInt();
        if((a>=10 && a<= 20) || (b>= 10 && b<= 20)){
            System.out.println("true");
        }else{
            System.out.println("false");
        } */



//             Exercise 9
//Take two Booleans from input, which represent whether two monkeys smile or not.
// We are in trouble if they are both smiling or if neither of them is smiling.
// Output true if we are in trouble.


      /*  Scanner input = new Scanner(System.in);
        System.out.println("Please say, first Monkey is smiling or not");
        boolean first = input.nextBoolean();
        System.out.println("Please say, second Monkey is smiling or not");
        boolean second = input.nextBoolean();
        boolean smileTest = (first == second);
        System.out.println(smileTest);
        */



 //          Exercise 10
//Take a string from input representing a month and a number representing the year.
// Output the number of days in that month.

        /* Scanner input = new Scanner(System.in);
        System.out.println("Please input the year");
        int year = input.nextInt();
        System.out.println("Please input the month ");
        String month = input.nextLine();


        boolean thirtyDays = ((month.equals("September")) || (month.equals("June")) ||
                (month.equals("November")) || (month.equals("April")));


        if (thirtyDays) {

             System.out.println("This month has 30 days.");

        }   else if (month.equals("February")) {
            boolean leap = (year % 4 == 0);
            if(leap == true) {
                  System.out.println(year + " year is a leap year and has 366 days");
            } else {
                  System.out.println(month + " has 28 days");
            }
        }
        else {
            System.out.println("This month have 31 day.");
        }*/

//                Exercise 11 UNSOLVED
//Solve exercise 10 using switch statement.


    }
}
