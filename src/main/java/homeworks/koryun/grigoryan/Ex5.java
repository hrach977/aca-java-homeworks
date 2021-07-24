package homeworks.koryun.grigoryan;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fehrenheit.");
        double fehrenheit= input.nextDouble();
        double celcius = (fehrenheit-32)*5/9;
        System.out.println("The temperature is "+celcius+"in Celcius.");
    }
}
