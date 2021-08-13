package homeworks.artur.danielyan.homework3;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(isRedOrBlue("red is a good color"));
        System.out.println(isRedOrBlue("blue is a good color too"));
        System.out.println(isRedOrBlue("but orange is a bad color"));
    }

    public static String isRedOrBlue(String str){
        if(str.startsWith("red")){
            return "red";
        }else if(str.startsWith("blue")){
            return "blue";
        }else{
            return "";
        }
    }
}
