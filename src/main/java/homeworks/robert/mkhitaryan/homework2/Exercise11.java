package homeworks.robert.mkhitaryan.homework2;

public class Exercise11 {
//    Given an array length 1 or more of ints, output the difference between the largest and
//    smallest values in the array.
    public static void main(String[] args) {
        int[] arr = {3, 5, 13, 1, 145, 88, 1, 99, 145, 10, 12, 4, 3};
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        int diff = max - min;
        System.out.println("The largest value is : " + max);
        System.out.println("The smallest value is : " + min);
        System.out.println("Difference between the largest and smallest values is : " + diff);
    }
}
