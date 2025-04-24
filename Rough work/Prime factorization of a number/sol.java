import java.lang.reflect.Array;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;//created temp because the value of n is updating so the loop might be effected if we put sqrt of n
        ArrayList<Integer> store = new ArrayList<>(); // storing the value
        store.add(1);// since all number are divided by 1

        for (int i = 2; i < Math.sqrt(temp+1); i++) {//putting sqrt of temp instead of n
            if (n % i == 0) {
                // System.out.println("value" + n); just to check
                // System.out.println("value of i" + i);

                while (n % i == 0) { //divinding the number until reminder is zero
                    n = n / i;
                    store.add(i);
                    System.out.println(n);

                }

            }
        }
        if (n != 1) {//if the n is not 1 means there a prime number left in n
            store.add(n); 
        }
        System.out.println(store);
    }
}
