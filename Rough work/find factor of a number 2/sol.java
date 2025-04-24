import java.lang.reflect.Array;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> digit = new ArrayList<>();

        for (int i = 1; i<Math.sqrt(n)+1;i++){// lets take 36 as an example of squrt of 36 is 6 so loop will work till 6
            if (n%i  == 0){ // if 36 % [1,2,3,4,5,6] (because it starts from 1 and will have 6 iteration ) == 0


                digit.add(i);//(1,2,3,4,6)
                if (i!=Math.sqrt(n))// if i == 6 then it will not enter the if statemnt
                    digit.add(n/i);//
                

            }
        }
        Collections.sort(digit);
        System.out.println(digit);
    }
}

