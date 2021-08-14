package homeworks.tinasargsyan.hw3;
/*
Given 2 strings, return their concatenation,
except omit the first char of each.
The strings will be at least length 1.
 */
public class Exercise4 {
    public static void main(String[] args) {
        String first = "KKK";
        String second = "BBB";
        System.out.println(concatStrings(first,second));
    }

    public static String concatStrings(String first, String second){
        String concat= " ";
        if(first.substring(1).length()>=1 && second.substring(1).length()>=1){
            concat = (first.substring(1) + second.substring(1));
        }else{
            System.out.println("String length should be 1 or more");
        }
        return concat;
    }
}
