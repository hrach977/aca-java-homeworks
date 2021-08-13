package homeworks.koryun.grigoryan.homework3;

public class Ex17 {
    public static void main(String[] args) {
        System.out.println(generateString(""));
        System.out.println(generateString("abc"));

    }
    public static String generateString(String str){
        //Using string builder to avoid creating new string objects in each iteration
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            sb.append(ch);
            sb.append(ch);
        }
        return sb.toString();


    }
}
