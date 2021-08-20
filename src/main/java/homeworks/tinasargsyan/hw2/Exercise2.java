package homeworks.tinasargsyan.hw2;
/*
Write a program to print out all Armstrong numbers between 1 and 500.
If sum of cubes of each digit of the number is equal to the number itself,
then the number is called an Armstrong number.
 */
public class Exercise2 {
    public static void main(String[] args) {
//        int i=1;
//        int a;
//        int armstrong;
//        int n;
//        System.out.println("Armstrong numbers are");
//        while(i<=500) {
//            if(i<10){
//                System.out.println(i);
//            }
//            n=i;
//            armstrong=0;
//            while(n>0) {
//                a=n%10;
//                armstrong+=(a*a*a);
//                n/=10;
//            }
//            if(armstrong==i) {
//                System.out.println(i);
//            }
//            i++;
//        }


        int digit1;
        int digit2;
        int digit3;
        int temp;

        for (int number=1; number<=500; number++) {
            if (number<10) {
                System.out.println(number);
            } else if (number>=10 && number<=99) {
                temp = number;
                digit1 = temp%10;
                temp/=10;
                digit2 = temp%10;
                if (Math.pow(digit1, 2) + Math.pow(digit2, 2) == number) {
                    System.out.println(number);
                }
            } else if (number>=100 && number<=500) {
                temp = number;
                digit1 = temp%10;
                temp/=10;
                digit2 = temp%10;
                temp/=10;
                digit3 = temp%10;
                if (Math.pow(digit1, 3) + Math.pow(digit2, 3) + Math.pow(digit3, 3) == number) {
                    System.out.println(number);
                }
            }
        }
    }
}
