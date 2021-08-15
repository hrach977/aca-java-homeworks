// Write a program to read the numbers from input till the user
// wants (user will choose to continue via y/n answers)and at the
// end the program should display the largest and smallest numbers entered.

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkC1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        char yn;
        System.out.print("Please enter the first number: ");
        num = input.nextInt();
        int max=num, min=num;
        while (true) {
            System.out.print("Please enter another number: ");
            num = input.nextInt();
            if (num>max) {
                max=num;
            }
            if (num<min) {
                min=num;
            }
            System.out.print("Do you want to continue? (y/n) ");
            yn = input.next().charAt(0);
            if (yn == 'n') {
                System.out.println("The smallest entered number is: " + min);
                System.out.print("The largest entered number is: " + max);
                break;
            }
        }
    }
}