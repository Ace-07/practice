import java.lang.reflect.Array;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int divisor = a>=b ? a:b; // or we can direct the loop but, for better understanding we use this
        int dividend = a<=b ? a:b;
        while (divisor != 0){
            int reminder = dividend % divisor;
            dividend = divisor;// we are updating dividend by divisor
            divisor = reminder;// we are updating divisor by remainder

        }
        System.out.println(dividend); // the final dividend will be the gcd


    }
}
