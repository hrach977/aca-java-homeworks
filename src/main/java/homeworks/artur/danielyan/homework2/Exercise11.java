package homeworks.artur.danielyan.homework2;

public class Exercise11 {
    public static void main(String[] args) {
        int[] arr = {8,82,9,12,78,98,42,542,21};

        int max = arr[0];
        int min = arr[0];

        for(int e : arr){
            if(e > max){
                max = e;
            }
            if(e < min){
                min = e;
            }
        }
        System.out.println(max - min);
    }
}
