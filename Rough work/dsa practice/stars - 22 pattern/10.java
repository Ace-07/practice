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

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            for (int p = 0; p < (i+1); p++) {
                System.out.print(ch);

            }
            System.out.println();
        }
        for (int k = 0 ;k<n;k++){
            for(int m = 0;m<n-(k+1);m++){
                System.out.print(ch);

            }
            System.out.println();

        }
    }
}
/*
5
*
**
***
****
*****
****
***
**
*

*/











