package homeworks.koryun.grigoryan.homework3;

public class Ex19 {
    public static void main(String[] args) {
        System.out.println(charsEqual("*afjefdsfh*h"));
        System.out.println(charsEqual("*a"));
        System.out.println(charsEqual("a*"));
        System.out.println(charsEqual("a*a"));
    }
    public static boolean charsEqual(String str){
        if(str.length() < 3){
            return false;
        }
        if(str.charAt(0) == '*' || str.charAt(str.length()-1) == '*'){
            return false;
        }
        for(int i = 1; i < str.length()-1;i++){
            if(str.charAt(i) == '*'){
                if(str.charAt(i-1) != str.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;
    }
}
