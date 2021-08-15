package homeworks.tinasargsyan.hw3;
/*
Given a string,
if the string begins with “red” or “blue”
return that color string,
otherwise return the empty string.
 */
public class Exercise9 {
    public static void main(String[] args) {
        String wRed = "reds";
        String wBlue = "blues";
        System.out.println(wColor(wRed));
        System.out.println(wColor(wBlue));
    }

    public static String wColor(String str) {
        //V1
//        if(str.startsWith("red")){
//            return "red";
//        }else if(str.startsWith("blue")){
//            return "blue";
//        }
//        return "";
        //V2
        return str.startsWith("red") ? "red" :
                str.startsWith("blue") ? "blue" : "";
    }
}

