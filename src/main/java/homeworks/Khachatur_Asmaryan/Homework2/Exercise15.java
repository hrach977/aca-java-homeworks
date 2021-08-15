package homeworks.Khachatur_Asmaryan.Homework2;

public class Exercise15 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        int inputNumber = 10;
        for (int i =  0; i < inputArray.length; i++) {
            for (int j  = i+1; j < inputArray.length; j++) {
                if(inputArray[i]+inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
                }
            }
        }
    }
}
