package homeworks.koryun.grigoryan.homework2;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice = 'y';
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        do{
            System.out.println("Enter an integer");
            int num = input.nextInt();
            if (num>largest){
                largest = num;
            }
            if (num < smallest){
                smallest = num;
            }
            System.out.println("Do you want to continue? y|n");
            choice = input.next().charAt(0);
            if (choice=='n'){
                break;
            }
        }while(choice=='y');

        System.out.println("Largest number is "+ largest );
        System.out.println("Smallest number is "+smallest);

    }
}
