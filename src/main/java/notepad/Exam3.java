package notepad;

import java.util.Scanner;

public class Exam3 {
    public static String lcp(String s, String t){

        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String lrs="";
        int n = str.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){

                String x = lcp(str.substring(i,n),str.substring(j,n));

                if(x.length() > lrs.length()) lrs=x;
            }
        }
        System.out.println("Longest repeating sequence: "+lrs);
    }

}
