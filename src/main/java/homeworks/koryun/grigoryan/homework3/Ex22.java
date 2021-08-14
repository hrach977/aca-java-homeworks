package homeworks.koryun.grigoryan.homework3;

public class Ex22 {
    public static void main(String[] args) {
        //xxyxy
        System.out.println(isBalanced("xxy"));
        System.out.println(isBalanced("xxyxyy"));
        System.out.println(isBalanced("xx"));
        System.out.println(isBalanced("xyx"));
    }
    public static boolean isBalanced(String str){
        boolean balanced = false;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='x'){
                balanced = false;
            }else{
                balanced = true;
            }
        }
        return balanced;
    }
}
