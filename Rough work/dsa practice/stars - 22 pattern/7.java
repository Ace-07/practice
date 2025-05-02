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

            for (int j = 0 ; j < n - (i+1); j++) {
                System.out.print(" ");

                }
            for (int k = n - i ;k<n;k++){
                System.out.print(ch);


            }
            for (int m = n ; m < (i+1)+n;m++){
                System.out.print(ch);
            }



            System.out.println();


        }
    }
}
/*
3
  *
 ***
*****

*/








