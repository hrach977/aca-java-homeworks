package homeworks.tinasargsyan.hw2;
/*
Given an array of ints,
output true if the array contains no 1’s and no 3’s.
 */
public class Exercise6 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,7};
        boolean flag=true;


        for (int element : arr){
            if(element ==1 || element ==3){
                flag=false;
                break;
            }
        }

         System.out.println(flag);
    }
}
