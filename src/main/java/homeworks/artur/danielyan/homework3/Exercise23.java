package homeworks.artur.danielyan.homework3;

public class Exercise23 {
    public static void main(String[] args) {
        System.out.println(isEqualDogsAndCats("erjbg dog jgf dog irgwh catgwg catdog"));//true
        System.out.println(isEqualDogsAndCats("nerg dog herfu cat grjwigdog"));//false
        System.out.println(isEqualDogsAndCats("dog cat"));//true
        System.out.println(isEqualDogsAndCats("cat reghsgn dog gqgnca"));//true
        System.out.println(isEqualDogsAndCats("dog isn't a cat dog is a dog"));//false
    }

    public static boolean isEqualDogsAndCats(String str){
        int cat = 0;
        int dog = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.startsWith("dog", i)){
                dog++;
                i+=2;
            }else if(str.startsWith("cat", i)){
                cat++;
                i+=2;
            }
        }

        return cat==dog;
    }
}
