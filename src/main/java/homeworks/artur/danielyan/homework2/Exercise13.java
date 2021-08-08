package homeworks.artur.danielyan.homework2;

public class Exercise13 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,78,56,1,45,8,120,3};

        int[] reversed = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--){
            reversed[i] = arr[arr.length-1-i];
        }

        for(int e : reversed){
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
