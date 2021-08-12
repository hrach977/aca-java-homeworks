package homeworks.Khachatur_Asmaryan.Homework2;

public class Exercise10 {
    public static void main(String[] args) {
        int[] nums1 = {9, 1, 2, 6, 7};
        int[] nums2 = {7, 3, 1, 6, 67};
        int count = 0;
        for (int i=0; i<nums1.length; i++) {
            if (nums1[i]!= nums2[i] && Math.abs(nums1[i]-nums2[i])<=2) {
                count++;
            }
        }
        System.out.println(count);

    }
}
