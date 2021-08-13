package homeworks.Khachatur_Asmaryan.Homework2;

public class Exercise11 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int max = num[0];
        int min = num[0];
        for (int elem : num) {
            max = Math.max(max, elem);
            min = Math.min(min, elem);
        }
        System.out.println("difference :" + (max-min));
    }
}
