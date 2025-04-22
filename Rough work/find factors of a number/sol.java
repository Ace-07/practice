import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // find the factor of the given number
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> digit = new ArrayList<>();

        for (int i = 1; i<n;i++){
            if (n%i  == 0){

                digit.add(i);
            }
        }
        System.out.println(digit);


    }
}



