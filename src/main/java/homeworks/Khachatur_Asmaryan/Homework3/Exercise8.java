package homeworks.Khachatur_Asmaryan.Homework3;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        
    }
    public String theEnd(String str, boolean front) {
        if (front){
        return str.substring(0,1);}
  else{
        return str.substring(str.length()-1);}
    }

}
