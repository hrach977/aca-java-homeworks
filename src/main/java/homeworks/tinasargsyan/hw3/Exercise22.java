package homeworks.tinasargsyan.hw3;
/*
We'll say that a String is xy-balanced
if for all the 'x' chars in the string,
there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not.
One 'y' can balance multiple 'x's.
Return true if the given string is xy-balanced.
 */
public class Exercise22 {
    public static void main(String[] args) {
        System.out.println(isXYBalanced("xXujy"));
        System.out.println(isXYBalanced("xyx"));
    }

    public static boolean isXYBalanced(String str){
          str = str.toLowerCase();
          if(!str.contains("x")){
              return  true;
          }
          int idx = str.lastIndexOf('y');
          if(idx==-1){
            return false;
        }
        int lastIndexOfX = str.lastIndexOf('x');
        return lastIndexOfX < idx;
    }
}
