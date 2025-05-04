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

            for (int p = 0; p < (i+1); p++) {
                if(i%2==0)
                    if (p %2 == 0)
                        System.out.print(i-i+1);
                    else
                        System.out.print(i-i);
                else
                if (p %2 == 0)
                    System.out.print(0);
                else
                    System.out.print(1);

            }
            System.out.println();
//        }
//        for (int k = 0 ;k<n;k++){
//            for(int m = 0;m<n-(k+1);m++){
//                System.out.print(ch);
//
//            }
//            System.out.println();

        }
    }
}
/*

5
1
01
101
0101
10101
*/










