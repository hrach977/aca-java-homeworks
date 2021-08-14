package homeworks.tinasargsyan.hw3;
/*
Given a string, and a Boolean parameter front,
return a string length 1 from its front,
unless front is false,
in which case return a string length 1 from its back.
The string will be non-empty.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String first = "Red";
        String second = "Blue";
        System.out.println(frontBack(first,true));

    }
    public static String frontBack(String str, boolean front){
        if(front){
            return str.substring(0,1);
        }
           return str.substring(str.length()-1);
    }
}
