package homeworks.artur.danielyan.homework3;

public class Exercise22 {
    public static void main(String[] args) {
        System.out.println(isXYBalanced("xxy"));//true
        System.out.println(isXYBalanced("xyx"));//false
        System.out.println(isXYBalanced("gjwl xx greuo yfno"));//true
        System.out.println(isXYBalanced(" geiry i[rwefxx fnpw"));//false
    }

    public static boolean isXYBalanced(String str){
        boolean flag = true;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'y'){
                flag = true;
            }
            if(str.charAt(i) == 'x'){
                flag = false;
            }
        }
        return flag;
    }
}
