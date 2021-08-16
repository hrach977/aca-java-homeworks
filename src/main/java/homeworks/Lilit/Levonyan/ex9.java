package homeworks.Lilit.Levonyan;

public class ex9 {
    public static void main(String[] args) {
        System.out.println(match("Reddy"));
    }
    public static String match(String str){
        if(str.toLowerCase().startsWith("blue")){
            return "blue";
        }else if(str.toLowerCase().startsWith("red")){
            return "red";
        }
        return str;
    }

}
