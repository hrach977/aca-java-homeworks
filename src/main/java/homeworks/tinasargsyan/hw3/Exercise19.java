package homeworks.tinasargsyan.hw3;
/*
Write a method that returns true if for every '*' (star) in the string,
if there are chars both immediately before and after the star,
they are the same.
 */
public class Exercise19 {
    public static void main(String[] args) {
        System.out.println(starChar("bar*rev"));
        System.out.println(starChar("bar*ev"));
    }

    public static boolean starChar(String str){
        int length = str.length();
        boolean areTheSame = true;
        for (int i = 0; i < length; i++) {
            String tmpString = str.substring(i,i+1);
            if (tmpString.equals("*") && i > 0 && i < length-1) {
                if (str.charAt(i-1) == str.charAt(i+1))
                areTheSame = true;
                else
                areTheSame = false;
            }
        }
        return areTheSame;

    }

}
