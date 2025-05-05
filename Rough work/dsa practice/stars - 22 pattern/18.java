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
        char ch = 'A';
        int increase=0;
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            int decrease = 0;

            for (int j = 0 ;j<i+1;j++){

                System.out.print((char)(ch +((n-1) -(increase-decrease))));
                decrease +=1;
            }
            increase +=1;

            System.out.println();
        }
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
/*
5
E
DE
CDE
BCDE
ABCDE
*/












