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
        int d = 2;
        int add = 1;


        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            int min = 0;
            for (int p = 0; p < (i+1); p++) {
                System.out.print(p+1);

            }
            for(int m = 0;m<(2*n-d);m++){
                System.out.print(" ");


            }
            for(int f = 0; f<i+1;f++){

                System.out.print(add-min);
                min = min+1;

            }
            d = d+2;
            add = min+1;


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
1        1
12      21
123    321
1234  4321
1234554321

*/











