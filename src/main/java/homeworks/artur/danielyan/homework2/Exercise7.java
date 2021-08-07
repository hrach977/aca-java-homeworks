package homeworks.artur.danielyan.homework2;

public class Exercise7 {
    public static void main(String[] args) {
        int[] arr = {6,2,5,3};
        int[] newArr = new int[arr.length];

        for(int i = 0; i < newArr.length-1; i++){
            newArr[i] = arr[i+1];
        }
        newArr[arr.length-1] = arr[0];

        for(int e : newArr){
            System.out.print(e + " ");
        }
    }
}
