//  Take two floating point numbers from input. Check whether they are the same up to three decimal places.
//  Test Data: 12.1245, 12.1235 Expected Output: They are different
//  Test Data: 12.1245, 121247 Expected Output: They are the same up to three decimal places

package homeworks.aramkhachatryan;

import java.util.Scanner;

public class HomeworkB3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first floating point number: ");
        double num1 = input.nextDouble();
        System.out.print("Please enter second floating point number: ");
        double num2 = input.nextDouble();
        double num1rnd = Math.floor(num1*1000)/1000;
        double num2rnd = Math.floor(num2*1000)/1000;
        System.out.println(num1rnd + " and " + num2rnd);
        if (Math.abs(num1rnd - num2rnd) < 0.001) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}