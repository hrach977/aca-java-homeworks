package homeworks.robert.mkhitaryan.homework2;

public class Exercise10 {
//    Given two arrays of ints of the same length, for every element in the first array consider the
//    corresponding element in the second array (i.e. at the same index). Output the count of the
//    number of times that the two elements differ by 2 or less, but are not equal.
    public static void main(String[] args) {
        int[] firstArray  = {1, 2, 3, 4, 5, 6};
        int[] secondArray = {1, 2, 6, 5, 8, 8};
        int count = 0;
        int diff;
        for (int i = 0; i < firstArray.length; i++) {
            diff = Math.abs(firstArray[i] - secondArray[i]);
            if (diff > 0 && diff <= 2) {
                count++;
            }
        }
        System.out.println("The count is: " + count);
    }
}
