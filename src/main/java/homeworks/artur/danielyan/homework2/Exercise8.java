package homeworks.artur.danielyan.homework2;

public class Exercise8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        if(arr.length != 0) {
            int save = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = save;

            for (int e : arr) {
                System.out.print(e + " ");
            }
            System.out.println();
        }else{
            System.out.println("Array doesn't contain anything");
        }
    }
}
