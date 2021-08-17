package homeworks.artur.danielyan.homework3;

public class Exercise22 {
    public static void main(String[] args) {
        System.out.println(isXYBalanced("xxy"));//true
        System.out.println(isXYBalanced("xyx"));//false
        System.out.println(isXYBalanced("gjwl xx greuo yfno"));//true
        System.out.println(isXYBalanced(" geiry i[rwefxx fnpw"));//false
        System.out.println(isXYBalanced("fwqx or xojx xxx y"));//true
        System.out.println(isXYBalanced("yyyy g3bn y x"));//false
    }

    public static boolean isXYBalanced(String str){
        if(!str.contains("x")){
            return true;
        }
        int idx = str.lastIndexOf('y');
        if(idx==-1){
            return false;
        }
        int idy = str.lastIndexOf('x');
        return idx > idy;
    }
}
