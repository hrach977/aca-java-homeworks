package homeworks.tinasargsyan.hw3;
/*
Return the number of times that the string "hi" appears anywhere in the given string.
 */
public class Exercise20 {
    public static void main(String[] args) {
          System.out.println(numberOfTimes("hihi"));
          System.out.println(numberOfTimes("sayhi"));
          System.out.println(numberOfTimes("i"));
    }

    public static int numberOfTimes(String str){
        int count = 0;
        for (int i=0; i<str.length()-1; i++) {
            if (str.startsWith("hi", i)) {
                count++;
                i++;
            }
        }
        return count;
 }
}
