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
        char ch = '*';
        int inc = 0;
        scanner.nextLine();
        for (int i = 0; i < n; i++) {


            for (int j = 0; j < n - i; j++) {
                System.out.print(ch);
            }
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            for (int f = 0; f < i; f++) {
                System.out.print(" ");
            }


            for (int k = 0; k < n - i; k++) {
                System.out.print(ch);
            }


            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int m = 0; m < i+1; m++) {
                System.out.print(ch);

            }
            for (int o = 0;o<(2*n)-(2+inc);o++){
                System.out.print(" ");

            }

            for (int p = 0;p<i+1;p++){
                System.out.print(ch);
            }
            inc+=2;

            System.out.println();
        }
    }
}
/*
5
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/











