package homeworks.koryun.grigoryan.homework2;

public class Ex11 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 3, 8};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : arr){
            if (num > largest){
                largest=num;
            }
            if (num < smallest){
                smallest = num;
            }
        }
        System.out.println(largest-smallest);
    }
}
