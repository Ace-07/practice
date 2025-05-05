import java.lang.reflect.Array;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

//permutation
//possibility
//formula

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();




        scanner.nextLine();
        for (int i = 0; i < n; i++) {

            for (char c = 'A'; c <= 'A'+(n-(i+1)); c++) {
                System.out.print(c+ " ");


            }

            System.out.println();

        }
//        for (int k = 0 ;k<n;k++){
//            for(int m = 0;m<n-(k+1);m++){
//                System.out.print(" ");
//
//            }
//            for(int f = 0; f<k+1;f++){
//                System.out.print(n-(n-(f+1)));
//            }
//            System.out.println();
//
//        }
    }
}

/*
5
A B C D E 
A B C D 
A B C 
A B 
A 
*/











