package homeworks.artur.danielyan.homework3;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(threeOfFirstTwo("Hello!"));
        System.out.println(threeOfFirstTwo("He"));
        System.out.println(threeOfFirstTwo("H"));
        System.out.println(threeOfFirstTwo(""));
    }

    public static String threeOfFirstTwo(String str){
        String firstTwo;
        if (str.length() >= 2){
            firstTwo = str.substring(0,2);
        }else if (str.length() == 1){
            firstTwo = str;
        }else{
            return "";
        }

        return firstTwo + firstTwo + firstTwo;
    }
}
