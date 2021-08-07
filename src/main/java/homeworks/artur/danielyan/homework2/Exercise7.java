package homeworks.artur.danielyan.homework2;

public class Exercise7 {
    public static void main(String[] args) {
        int[] arr = {6,2,5,3};

        int save = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = save;

        for(int e : arr){
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
