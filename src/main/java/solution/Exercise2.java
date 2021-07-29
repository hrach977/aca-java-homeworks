package solution;

 import java.util.Scanner;

public class Exercise2 {
    //    Take 2 numbers from input. Print the result of their division.
    //    a)The input contains integers
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("input first number");
        int one = (int) input.nextFloat();
        System.out.println("input second number");
        int two = (int) input.nextFloat();
        int result = one/two;
        System.out.println("result is" + result );



    }

}
