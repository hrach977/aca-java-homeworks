package homeworks.artur.danielyan.homework2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int check;
        int num;
        int result = 0;
        System.out.println("The Armstrong numbers between 1 and 500 are:");
        System.out.println(1);

        for(int i = 10; i < 500; i++){
            check = i;
            while (check!=0){
                num = check%10; // taking last number of integer
                check = (check - num) / 10; // removing last number of integer

                result += Math.pow(num, 3);
            }
            if(result == i){
                System.out.println(i);
            }
            result = 0;
        }
    }
}
