package homeworks.artur.danielyan.homework2;

public class Exercise13 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,78,56,1,45,8,120};

        int temp;
        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
