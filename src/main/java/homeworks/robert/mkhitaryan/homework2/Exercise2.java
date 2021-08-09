package homeworks.robert.mkhitaryan.homework2;

public class Exercise2 {
//    Write a program to print out all Armstrong numbers between 1 and 500.If sum of cubes of each
//    digit of the number is equal to the number itself, then the number is called an Armstrong number.
//    For example, 153 is an Armstrong number: 153 = (1 * 1 * 1)+ (5 * 5 * 5)+ (3 * 3 * 3)
    public static void main(String[] args) {
        int digit;
        int number;
        int sumOfCubesOfEachDigit;
        for (int i = 1; i <= 500; i++) {
            if (i < 10) {
                System.out.println(i + " is Armstrong number");
                continue;
            } else if (i < 100) {
                continue;
            }
            number = i;
            sumOfCubesOfEachDigit = 0;
            while (number != 0) {
                digit = number % 10;
                number = number / 10;
                sumOfCubesOfEachDigit += digit * digit * digit;
            }
            if (i == sumOfCubesOfEachDigit) {
                System.out.println(i + " is Armstrong number");
            }
        }
    }
}
