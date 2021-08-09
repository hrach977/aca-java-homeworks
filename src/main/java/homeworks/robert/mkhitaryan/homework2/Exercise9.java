package homeworks.robert.mkhitaryan.homework2;

public class Exercise9 {
//    Given an array of ints, output true if every element is a ‘1’or a ‘4’.
//    NOTE: an empty array has no elements, so the result should be true in that case.
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 1, 4, 4, 1, 1, 4, 1};
//        int[] arr = {1, 4, 4, 1, 4, 3, 1, 1, 4, 1};
//        int[] arr = {};
        boolean emptyArrayOrEveryElementIsOneOrFour = true;
        if (arr.length != 0) {
            for (int i : arr) {
                if (!(i == 1 || i == 4)) {
                    emptyArrayOrEveryElementIsOneOrFour = false;
                    break;
                }
            }
        }
        System.out.println(emptyArrayOrEveryElementIsOneOrFour);
    }
}
