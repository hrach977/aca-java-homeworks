package homeworks.tinasargsyan.hw3;
/*
Return true
if the string "cat" and "dog" appear the same number of times
in the given string.
 */
public class Exercise23 {
    public static void main(String[] args) {
        System.out.println(sameTime("CatDog"));
        System.out.println(sameTime("catdogcat"));
        System.out.println(sameTime("catdoghjcatdog"));
    }

    public static boolean sameTime(String str){
        str = str.toLowerCase();
        int countCat = 0;
        int countDog = 0;
        for(int i=0;i<str.length()-2;i++){
            String str1 = str.substring(i,i+3);
            if(str1.compareTo("cat")==0){
                countCat++;
            }
            if(str1.compareTo("dog")==0){
                countDog++;
            }
        }
        if(countCat == countDog){
            return true;
        }
        return false;
    }

}
