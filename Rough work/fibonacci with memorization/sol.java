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
    public static int[] F = new int[51];
    public static void main(String[] args) {

        for (int i = 0; i < 51; i++) {
            F[i] = -1;
        }
        F[0] = 0;
        F[1] = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int x) {
        if (F[x]!= -1){
            return F[x];//if F[x] has the value it will automatically return the value and does not create a new branch
        }
        System.out.println(x);
        F[x] = fibonacci(x-1) + fibonacci(x-2);
        System.out.println(x);

        return F[x];


    }
}

