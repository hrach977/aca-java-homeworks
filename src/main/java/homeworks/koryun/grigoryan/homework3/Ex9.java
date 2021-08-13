package homeworks.koryun.grigoryan.homework3;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println(generateString("redisacolor"));
        System.out.println(generateString("blueisnotacolor"));
        System.out.println(generateString("iamnotdrunk"));
    }
    public static String generateString(String str){
        if(str.startsWith("red")){
            return "red";
        }else if(str.startsWith("blue")){
            return "blue";
        }else{
            return "";
        }

    }
}
