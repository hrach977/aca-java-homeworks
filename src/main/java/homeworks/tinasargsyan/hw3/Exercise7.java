package homeworks.tinasargsyan.hw3;
/*
Given a string of odd length,
return the string length 3 from its middle.
So “Candy” yields “and”.
The string length will be at least 3.
 */
public class Exercise7 {
    public static void main(String[] args) {
        String candy = "Candy";
        System.out.println(middleStr(candy));
        System.out.println(middleStr("dd"));
    }

    public static String middleStr(String str){
        String st = "String length should be 3 or more";
        if(str.length()>=3)
            return  str.substring((str.length()/2-1),(str.length()/2+2));
        return st;
    }

}
