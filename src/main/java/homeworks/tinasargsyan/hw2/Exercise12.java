package homeworks.tinasargsyan.hw2;
/*
Given an array of ints,
output true if
the sum of all the ‘2’-s in the array is exactly ‘8’.
 */
public class Exercise12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,2,2};
        boolean exactlyEight = true;
        int sum = 0;
//        for(int i = 0;i< arr.length;i++){
//            if(arr[i]==2){
//                sum+=arr[i];
//            }
//            if(sum==8){
//                exactlyEight=true;
//            }else{
//                exactlyEight=false;
//            }
//        }
//       System.out.println(exactlyEight);


        //V2
        for(int element : arr){
            if(element ==2){
                sum+=element;
            }
        }
        System.out.println(sum==8);

    }
}
