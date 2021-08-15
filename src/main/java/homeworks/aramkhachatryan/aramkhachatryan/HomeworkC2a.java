// Write a program to print out all Armstrong numbers between 1 and 500.
// If sum of cubes of each digit of the number is equal to the number itself,
// then the number is called an Armstrong number.
// For example, 153 is an Armstrong number: 153 = (1 * 1 * 1)+ (5 * 5 * 5)+ (3 * 3 * 3)

package aramkhachatryan;

public class HomeworkC2a {
    public static void main(String[] args) {
        int power;
        int dig1;
        int dig2;
        int dig3;
        for (int i = 1; i <= 500; i++) {
            dig1 = i / 100;
            dig2 = (i / 10) % 10;
            dig3 = i % 10;
            if (i == Math.pow(dig1, 3) + Math.pow(dig2, 3) + Math.pow(dig3, 3)) {
                System.out.println(i);
            }
        }
    }
}