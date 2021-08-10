package homeworks.artur.danielyan.homework2;

public class Exercise11 {
    public static void main(String[] args) {
        int[] arr = {12,82,9,8,78,98,42,542,21};

        int max = arr[0];
        int min = arr[0];

        for(int e : arr){
            max = Math.max(max, e);
            min = Math.min(min, e);
        }
        System.out.println(max - min);
    }
}
