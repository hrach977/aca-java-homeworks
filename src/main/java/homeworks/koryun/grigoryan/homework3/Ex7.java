package homeworks.koryun.grigoryan.homework3;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(middleOfString("candy"));
        System.out.println(middleOfString("house"));
        System.out.println(middleOfString("sometimes"));
    }
    public static String middleOfString(String str){
        return ""+str.charAt(str.length()/2-1) + str.charAt(str.length()/2) + str.charAt(str.length()/2+1);
    }
}
