package homeworks.Khachatur_Asmaryan.Homework2;

public class Exercise8 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        if (nums.length != 0) {
            int tmp = nums[0];
            for (int i = 1; i<=nums.length; i++) {
                nums[i - 1] = nums[i];
            }
            nums[nums.length] = tmp;
            for (int elem : nums ) {
                System.out.println(elem + " ");
            }
        }
    }
}
