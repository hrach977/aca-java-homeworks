package solution2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter first second");
        int second = input.nextInt();

        int a = first / 10;
        int b = first % 10;
        int c = second / 10;
        int d = second % 10;

        if ((first >= 25 && first <= 75) && (second >= 25 && second <= 75)){
            if (a == c || a == d || b == c || b == d){
                System.out.println("there is a common digit");

            }else{
                System.out.println("there is a no common digit");
            }
        }else{
            System.out.println("out of range");

        }
    }
}
