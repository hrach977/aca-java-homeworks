package homeworks.tinasargsyan.hw2;
/*
Write a program to print out all Armstrong numbers between 1 and 500.
If sum of cubes of each digit of the number is equal to the number itself,
then the number is called an Armstrong number.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int i=100;
        double a;
        int armstrong;
        int n;
        System.out.println("Armstrong numbers are");
        while(i<500) {
            n=i;
            armstrong=0;
            while(n>0) {
                a=n%10;
                armstrong+=(a*a*a);
                n/=10;
            }
            if(armstrong==i) {
                System.out.println(i);
            }
            i++;
        }

    }
}
