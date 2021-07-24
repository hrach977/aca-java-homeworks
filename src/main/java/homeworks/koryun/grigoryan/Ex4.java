package homeworks.koryun.grigoryan;
import java.util.*;
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the square");
        double side = input.nextDouble();
        System.out.println(side);
        double area = side*side;
        double perimeter = 4*side;
        System.out.println("The perimeter of the square is "+perimeter);
        System.out.println("The area of the square is "+area);
    }
}
