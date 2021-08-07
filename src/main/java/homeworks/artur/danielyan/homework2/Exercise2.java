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
                num = check%10;
                check = (check - num) / 10;

                result += Math.pow(num, 3);
            }
            if(result == i){
                System.out.println(i);
            }
            result = 0;

//            if(i <= 99){
//                int n1 = i%10;
//                int n2 = (i - i%10) / 10;
//                if( Math.pow(n1, 3) + Math.pow(n2, 3) == i ){
//                    System.out.println(i);
//                }
//            }else {
//                int n1 = i%10;
//                int n2 = ( (i - i%10) / 10 )%10;
//                int n3 = (i - i%100) / 100;
//
//                if( Math.pow(n1, 3) + Math.pow(n2, 3) + Math.pow(n3, 3) == i ){
//                    System.out.println(i);
//                }
//            }
        }
    }
}
