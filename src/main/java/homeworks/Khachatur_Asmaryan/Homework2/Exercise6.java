package homeworks.Khachatur_Asmaryan.Homework2;

public class Exercise6 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 7, 8, 4};
        boolean doesnotcontain = true;

        for (int element : nums) {

            if ( element == 1 || element == 3) {
                doesnotcontain = false;
                break;
            }
        }
        System.out.println(doesnotcontain);
    }
}
