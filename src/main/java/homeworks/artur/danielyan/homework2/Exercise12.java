package homeworks.artur.danielyan.homework2;

public class Exercise12 {
    public static void main(String[] args) {
        int[] arr = {2,4,7,1,2,4,6,2,4,7,2,1};

        int result = 0;
        for(int e : arr){
            if(e == 2){
                result += 2;
            }
        }
        System.out.println(result == 8);
    }
}
