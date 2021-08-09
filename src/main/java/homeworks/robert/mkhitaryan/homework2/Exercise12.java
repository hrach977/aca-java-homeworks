package homeworks.robert.mkhitaryan.homework2;

public class Exercise12 {
//    Given an array of ints, output true if the sum of all the ‘2’-s in the array is exactly ‘8’.
    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 5, 2, 6, 7, 9, 21, 98};
        int[] arr = {1, 2, 2, 5, 2, 6, 7, 2, 9, 21, 98};
        int sum = 0;
        for (int i : arr) {
            if (i == 2) {
                sum += 2;
            }
        }
        System.out.println(sum == 8);
    }
}
