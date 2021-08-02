package homeworks.koryun.grigoryan.homework0;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size in inches.");
        double inches = input.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches+" Inches is "+ meters +" meters");
    }
}
