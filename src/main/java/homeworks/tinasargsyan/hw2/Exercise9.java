package homeworks.tinasargsyan.hw2;
/*
Given an array of ints, output true
if every element is a ‘1’ or a ‘4’.
NOTE: an empty array has no elements,
so the result should be true in that case.
 */
public class Exercise9 {
    public static void main(String[] args) {
        boolean flag = true;
        int [] arr = {1, 4, 4, 1};
//        for(int i=0;i<arr.length;i++){
//
//            if(arr[i]==4 || arr[i]==1) {
//                flag=true;
//            }else if(arr.length<1){
//                flag = true;
//            }else {
//                flag=false;
//            }
//        }
//        System.out.println(flag);

        for(int a : arr){
            if(a!=1 && a!=4){
                flag=false;
                break;
            }
        }
        System.out.println(flag);

    }
}
