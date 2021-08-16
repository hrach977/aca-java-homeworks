package homeworks.Lilit.Levonyan;

public class ex23 {
    public static void main(String[] args) {
        myString("Catdogcatdog");

    }
    public static void myString(String str){
        int count1 = 0;
        int count2 =0;
        for(int i = 1; i < str.length(); i++){
            if(str.toLowerCase().charAt(i-1) == 'd' && str.toLowerCase().charAt(i) == 'o' && str.toLowerCase().charAt(i+1) == 'g' ){
                count1 ++;
            }
            if(str.toLowerCase().charAt(i-1) == 'c' && str.toLowerCase().charAt(i) == 'a' && str.toLowerCase().charAt(i+1) == 't' ){
                count2 ++;
            }
        }
        System.out.println(count1 == count2);
    }
}
