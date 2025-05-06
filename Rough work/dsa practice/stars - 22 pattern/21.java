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
            if (i == 0 || (i + 1) == n)
                    for (int j = 0; j < n; j++) {
                        System.out.print(ch);
                    }
            else {
                for (int k = 0; k < 1; k++) {
                        System.out.print(ch);
                }
                for (int f = 0; f < n - 2; f++) {
                    System.out.print(" ");
                }
                for (int g = 0; g < 1; g++) {
                    System.out.print(ch);
                }

            }
            System.out.println();
        }

    }
}
/*
10
**********
*        *
*        *
*        *
*        *
*        *
*        *
*        *
*        *
**********
*/












