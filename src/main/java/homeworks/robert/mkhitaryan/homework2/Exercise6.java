package homeworks.robert.mkhitaryan.homework2;

public class Exercise6 {
//    Given an array of ints, output true if the array contains no 1’s and no 3’s.
    public static void main(String[] args) {
//        int[] arr = {1, 2, 5, 7, 9, 3};
//        int[] arr = {2, 5, 7, 9, 3};
//        int[] arr = {1, 2, 5, 7, 9};
        int[] arr = {2, 5, 7, 9};
        boolean arrayContainsNoOnesAndNoThrees = true;
        for (int i : arr) {
            if (i == 1 || i == 3) {
                arrayContainsNoOnesAndNoThrees = false;
                break;
            }
        }
        System.out.println(arrayContainsNoOnesAndNoThrees);
    }
}
