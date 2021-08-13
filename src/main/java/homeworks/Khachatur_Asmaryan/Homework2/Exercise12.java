package homeworks.Khachatur_Asmaryan.Homework2;

public class Exercise12 {
    public static void main(String[] args) {
        int[] num = {2, 42, 2, 3, 2, 12, 45, 14, 2};
        int sum=0;
        for (int element : num) {
            if (element == 2) {
                sum+=element;
            }
        }
        System.out.println(sum==8);
    }
}
