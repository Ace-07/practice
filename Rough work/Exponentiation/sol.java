import java.lang.reflect.Array;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

//permutation
//possibility
//formula
import java.util.Scanner;
import java.text.DecimalFormat;

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int y = sc.nextInt();
            double result = 0;
            result = power(n, y);
            System.out.println(removeTrailingZeros(result));
        }

        public static double power(int x, int n) {
            if (x == 0) {
                return 1;
            } else if (n % 2 == 0) {
                double y = Math.pow(x, (double) n / 2);// if the number is odd the 
                return y * y;

            } else
                return x * Math.pow(x, n - 1);


        }

        public static String removeTrailingZeros(double number) {
            return new DecimalFormat("#.#").format(number);
        }
    }

/*
5
3
125
*/  


