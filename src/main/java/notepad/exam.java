package notepad;

import java.util.Scanner;
public class exam {
    public static void main(String[] args) {


        //test case 1
        int[][] multi = new int[][]{
                { 1, 2, 3 },
                { 4, 0, 5 },
                { 0, 6, 7 },
        };

        //test case 2
        int[][] multi2 = new int[][]{
                { 1, 0, 1, 1, 0 },
                { 0, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 1 },
                { 1, 0, 1, 1, 1},
                { 1, 1, 1, 1, 1},
        };

        TwoDArraySetZero(multi2);
    }



    static  void  TwoDArraySetZero(int[][] array){

        //iterate through all elements
        for(int i = 0 ; i <= array.length-1 ; i++){
            for (int j = 0; j <= array.length-1; j++) {

                //checking if match with zero
                if (array[i][j] == 0){

                    //set replace with -1 all matching zero row and col if not zero
                    for (int k = 0; k <= array.length-1 ; k++) {
                        if(array[i][k] != 0 )
                            array[i][k] = -1;
                        if(array[k][j] != 0)
                            array[k][j]= -1;
                    }
                }
            }
        }


        //print array
        for(int i = 0; i <= array.length-1; i++)
        {
            for(int j = 0; j <= array.length-1; j++)
            {
                //replace with zero all -1

                if(array[i][j] == -1)
                    array[i][j] = 0;

                System.out.printf("%5d ", array[i][j]);
            }
            System.out.println();
        }

    }

}