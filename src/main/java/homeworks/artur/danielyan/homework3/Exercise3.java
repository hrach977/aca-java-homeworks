package homeworks.artur.danielyan.homework3;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(cutInHalf("Hell"));
    }

    public static String cutInHalf(String cutThis){
        if(cutThis.length()%2 == 1){
            System.out.println("Given string length must be an even number");
            return "";
        }
        return cutThis.substring(0,cutThis.length()/2);
    }
}
