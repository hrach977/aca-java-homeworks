package homeworks.tinasargsyan.hw2;
/*
Given an array of ints, output true
if every element is a ‘1’ or a ‘4’.
NOTE: an empty array has no elements,
so the result should be true in that case.
 */
public class Exercise9 {
    public static void main(String[] args) {
        boolean equalsTrue = true;
        int [] arr = {2, 3, 4, 5};
        for(int i=0;i<arr.length;i++){

            if(arr[i]==4 || arr[i]==1) {
                equalsTrue=true;
            }else if(arr.length<1){
                equalsTrue = true;
            }else {
                equalsTrue=false;
            }
        }
        System.out.println(equalsTrue);
    }
}
