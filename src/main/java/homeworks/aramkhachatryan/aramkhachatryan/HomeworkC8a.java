//Solve Exercise 7 without constructing a new array. Just modify the original one.

package aramkhachatryan;

public class HomeworkC8a {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 6;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 3;
        int temp = arr[0];
        for (int i = 0; i < 3; i++) {
            arr[i] = arr[i+1];
        }
        arr[3] = temp;
        System.out.print("Array elements new order: { ");
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}