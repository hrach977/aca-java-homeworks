package homeworks.artur.danielyan.homework2;

public class Exercise6 {
    public static void main(String[] args) {
        int[] arr = {2,4,45,42,2,5,75,3,1};

        boolean flag = true;

        for(int e : arr){
            if(e == 1 || e == 3){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
