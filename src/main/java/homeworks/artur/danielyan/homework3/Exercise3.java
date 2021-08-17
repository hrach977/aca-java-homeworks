package homeworks.artur.danielyan.homework3;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(cutInHalf("Hell"));
    }

    public static String cutInHalf(String cutThis){
        return cutThis.substring(0,cutThis.length()/2);
    }
}
