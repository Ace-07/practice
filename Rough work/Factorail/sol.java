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
        System.out.println(Factorial(n));





    }
    public static int Factorial(int x){
        System.out.println("Calculating f("+x+")");
        if (x==0){
            return 1;
        }
        int f = x*Factorial(x-1);
        System.out.println("done f("+x+") and fac is :"+f);

        return f;

    }
}
