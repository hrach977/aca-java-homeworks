package homeworks.tinasargsyan.hw3;
/*
Given a string,
return a string where for every char in the original,
there are two chars.
 */
public class Exercise17 {
    public static void main(String[] args) {
        System.out.println(doubleChar("hello"));
        System.out.println(doubleChar("Bye"));
    }

    public static String doubleChar(String str){
        //V1
//        String str1 = "";
//        for (int i = 0; i < str.length(); i++) {
//             str1 += str.substring(i,i+1) + str.substring(i, i+1);
//        }
//        return str1;
        //V2
        String str1 = "";
        for ( int i = 0; i < str.length(); i++ ) {
            str1 += str.charAt(i) + str.charAt(i);
        }
        return str1;

    }
}
