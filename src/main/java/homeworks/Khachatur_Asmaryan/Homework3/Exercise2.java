package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise2 {
    public static void main(String[] args) {
        int digit1;
        int digit2;
        int digit3;
        int temp;

        for (int number = 1; number <= 500; number++) {
            if (number<10) {
                System.out.println(number);
        } else if (number >= 10 && number <= 99){
                temp = number;
                digit1 = temp%10;
                temp/=10;
                digit2 = temp%10;
                if (Math.pow(digit1, 2) + Math.pow(digit2, 2) == number) {
                    System.out.println(number);
                }
            } else if (number >= 100 && number <= 500) {
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
