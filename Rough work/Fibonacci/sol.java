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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));





    }
    public static int fibonacci(int x){
        if (x<=1)
            return x;
        int f1 = 0;
        int f2 = 1;
        int f = 0;
        for (int i = 1;i <x;i++){
            f = f1+f2;
            f1= f2;
            f2= f;

        }
        return f;


    }
}
