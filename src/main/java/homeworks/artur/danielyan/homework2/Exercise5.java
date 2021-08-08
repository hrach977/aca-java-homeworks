package homeworks.artur.danielyan.homework2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number");
        int n = input.nextInt();
        double result = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                result -= 1d/i;
            }else{
                result += 1d/i;
            }
        }
        System.out.println(result);
    }
}
