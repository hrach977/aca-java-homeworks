package homeworks.koryun.grigoryan.homework3;

public class Ex20 {
    public static void main(String[] args) {
        System.out.println(occurances("abbchiasdfhi"));
        System.out.println(occurances("hihihihi"));
        System.out.println(occurances("ih"));
        System.out.println(occurances("h"));
        System.out.println(occurances("i"));
        System.out.println(occurances(""));
        System.out.println(occurances("hi"));
    }

    public static int occurances(String str){
        int counter = 0;
        for(int i = 0;i<str.length()-1;i++){
            if (str.charAt(i) == 'h'){
                if (str.charAt(i+1) == 'i'){
                    counter++;
                }

            }
        }
        return counter;
    }
}
