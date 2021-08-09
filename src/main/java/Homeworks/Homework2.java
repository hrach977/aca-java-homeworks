package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //       Exercise 1 UNSOLVED
        //Write a program to read the numbers from input till the user wants (user will choose to continue via y/n answers)
        // and at the end the program should display the largest and smallest numbers entered


        //        Exercise 2 UNSOLVED


        //        Exercise 3
        //Write a program to print Fibonacci series of n terms, where n is input by user.

  /* Scanner input= new Scanner(System.in);
        System.out.println("PLease input n");
        int n = input.nextInt();
        int a = 1;
        int b = 1;
        int result ;
        for (int i = 1; i <= n; i++){
            System.out.println(a + " + " +  b + " = " + (a+b));
        result =  a+b;
        a = b;
        b = result; */


        // Exercise 4

       /* Scanner input = new Scanner(System.in);
        System.out.println("Please input n");
        int n = input.nextInt();
        double num = 0;
        for(int i = 1; i<=n; i++){

            double num1 = 1;
            double num2 = num1/i;
            num+= (num2);


        }System.out.println(num);*/


        //        Exercise 5 UNSOLVED


        //         Exercise 6
        //Given an array of ints, output true if the array contains no 1’s and no 3’s.

  /* Scanner input= new Scanner(System.in);
        System.out.println("Please say how much numbers you want to input to array ");
   int n = input.nextInt();

   int[] arr = new int[n];
   for(int i = 1; i< arr.length; i++){
       arr[i] = input.nextInt();
       if(arr[i] == 1 || arr[i] == 3){
           System.out.println(false);
       }else{
           System.out.println(true);
       }
   }*/


//          Exercise 7
//Given an array construct another array that is the original array “left shifted”by one.
   /*    int[] arr = {6, 2, 5, 3};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i <= arr.length-1; i++) {
            if(i == 3){
                System.out.println(arr[0]);
                break;
            }
            arr1[i] = arr[i + 1];

            System.out.print(arr1[i] + ", ");


        }*/


//           Exercise 8
//Solve Exercise 7 without constructing a new array. Just modify the original one
     /*  int[] arr = {6, 2, 5, 3};
        int save = arr[0];
        for(int i = 0; i<=arr.length-1; i++){
            while(i<=3){
                if(i == 3){
                    arr[3]=save;
                    System.out.print(arr[i]);
                    break ;
                }
                arr[i] = arr[i+1];
                System.out.print(arr[i] + ", ");
                break ;
            }

        }*/


//           Exercise 9
//           Given an array of ints, output true if every element is a ‘1’or a ‘4’.
      /*  Scanner input= new Scanner(System.in);
        System.out.println("Please say how much elements you want");
        int n = input.nextInt();
        if(n==0){
            System.out.println(true);
        }
        int[] arr = new int[n];
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = input.nextInt();
            if(arr[i] == 1 || arr[i] == 4){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }*/


//      Exercise 10 UNSOLVED
// Given two arrays of ints of the same length,
// for every element in the first array consider the corresponding element in the second array (i.e. at the same index).
// Output the count of the number of times that the two elements differ by 2 or less, but are not equal.


//          Exercise 11
/*
int[] arr= {10,4, 12389, 12390};
        Arrays.sort(arr);
        System.out.println("The difference is " + (arr[3] - arr[0]));

*/


//         Exercise 12
//Given an array of ints,
// output true if the sum of all the ‘2’-s in the array is exactly ‘8’
       /*int[] arr = {2, 4, 8, 112, 2, 8, 1290, 3, 6, 2, 0, 90, 2 };
       int sum = 0;
       for(int coll: arr){
           if (coll ==2){
               sum+=2;
           }

       }
        System.out.println(sum==8);*/


//      Exercise 13
//Write a program to reverse the elements of an integer array (1 dimensional)

    /*    int[] arr = {1, 2, 3, 4, 5,6,7, 8, 9, 10};
        System.out.println("This is a line of elements without reverse");
        for(int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("This is a line of elements with reverse");

        for(int i = arr.length- 1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }*/


//     Exercise 14
//Write a program to find and print the common elements between two arrays of integers.
/*
        int[] arr = {1231, 456, 1239, 56, 89,35487 } ;
        int[] arr1 = { 3289, 456, 90909, 547, 8787, 1239};

        int equal;
       for(int a : arr){
           for(int b : arr1){
               if(a == b ){
                   equal = a;
                   System.out.println(equal);
               }
           }


       }
       */




//       Exercise 15

//Write a program to find all pairs of elements in an integer array whose sum is equal to a specified number.
// The number is input by the user.

        Scanner input= new Scanner(System.in);
        int sum = input.nextInt();
        int[] arr = {4, 6, 4, 2, 8 };
        int count = 0;
        for (int i =  0; i < arr.length; i++)
        {
            for (int j  = i+1; j < arr.length; j++)
            {
                if(arr[i]+arr[j] == sum)
                {
                    count++;
                    System.out.println( arr[i] + " + " + arr[j] + " = " + sum);
                }
            }
        }
        System.out.println("The number of all variants is "+ count);
    }





    }