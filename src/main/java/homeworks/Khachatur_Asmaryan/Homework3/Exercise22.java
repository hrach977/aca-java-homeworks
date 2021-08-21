package homeworks.Khachatur_Asmaryan.Homework3;

public class Exercise22 {
    public static boolean isXYBalanced(String str) {
        if (!str.contains("x")) {
            return true;
        }
        int idx = str.lastIndexOf('y');
        if (idx==-1) {
            return false;
        }
        int lastIndexOfX = str.lastIndexOf('x');
        return lastIndexOfX < idx;
    }
}
