package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise7 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4};
        if (num.length != 0) {
            int[] res = new int[num.length];
            for (int i=1; i<num.length; i++) {
                res[i-1] = num[i];
            }
            res[res.length - 1] = num[0];
            for (int elem : res) {
                System.out.print(elem + " ");
            }
        }
    }

}
