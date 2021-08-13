package homeworks.Khachatur_Asmaryan.Homework2;

public class Exercise13 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        int temp;
        for (int i=0; i<nums.length/2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }
        for (int element : nums) {
            System.out.print(element + " ");
        }
    }
}
