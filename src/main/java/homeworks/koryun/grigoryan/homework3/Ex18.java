package homeworks.koryun.grigoryan.homework3;

public class Ex18 {
    public static void main(String[] args) {
        System.out.println(generateString("house", 1));
        System.out.println(generateString("house", 2));
        System.out.println(generateString("house", 3));
        System.out.println(generateString("house", 4));
        System.out.println(generateString("house", 5));

    }
    public static String generateString(String str, int n){
        //("house", 3) -> houuussseee
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.length()-i <=n){
                for(int j = 0;j<n;j++){
                    sb.append(str.charAt(i));
                }
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
