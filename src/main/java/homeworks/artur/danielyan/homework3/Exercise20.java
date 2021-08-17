package homeworks.artur.danielyan.homework3;

public class Exercise20 {
    public static void main(String[] args) {
        System.out.println(howManyHi("hi something hi hi texttext hi hi"));//6
        System.out.println(howManyHi("hi hi"));//2
        System.out.println(howManyHi(""));//0
        System.out.println(howManyHi("hi"));//1
        System.out.println(howManyHi(" hi "));//1
    }

    public static int howManyHi(String str){
        int count = 0;
        for(int i = 0; i <= str.length()-2; i++){
            if(str.startsWith("hi",i)){
                count++;
            }
        }
        return count;
    }
}
