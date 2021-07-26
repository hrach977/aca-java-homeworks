package homeworks;

import java.util.Scanner;

public class Home6 {
    public static void main(String[] args) {
        int number;
        double m = 0.0254;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        double data = number;
        System.out.println(data + " Inches iS " + data * m + " meters");



    }
}
