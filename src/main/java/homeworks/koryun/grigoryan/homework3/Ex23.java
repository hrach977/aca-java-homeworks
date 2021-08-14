package homeworks.koryun.grigoryan.homework3;

public class Ex23 {
    public static void main(String[] args) {
        System.out.println(countMatch("doggcattgdogca"));
        System.out.println(countMatch("dogcat"));
        System.out.println(countMatch("catdog"));
        System.out.println(countMatch("atdog"));
    }
    public static boolean countMatch(String str){
        int catCount = 0;
        int dogCount = 0;
        for(int i = 0;i<str.length()-2;i++){
            if (str.charAt(i)=='d' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g'){
                dogCount++;
            }else if(str.charAt(i)=='c' && str.charAt(i+1)=='a' && str.charAt(i+2)=='t') {
                catCount++;
            }
        }
        return catCount==dogCount;
    }
}
