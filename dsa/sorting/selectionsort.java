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
            int[] A = {4, 6, 7, 8, 2, 1};
            int n = 6;
            selectionsort(A,n);
            for (int i = 0 ;i<n;i++){
                System.out.print(A[i]+" ");
            }

        }

        public static void selectionsort(int[] A, int n) {
            for (int i = 0; i < n - 1; i++) {
                int iMin = i;//we assign the index 0 1 2 3 4 5 
                for (int j = i + 1; j < n; j++) { // we assign the j index to compare 1 2 3 4 5
                    if (A[j] < A[iMin]) // if there is any element in the array which is greater than iMin
                        iMin = j;// we will store the index to  int iMin 
                }
                int temp = A[i]; //Now time to criss cross we will store the original element in A[i] in temp
                A[i] = A[iMin];// the new assigned element in A[iMin] as seen in the above if condition , will get reasigned in the A[i]
                A[iMin] = temp; // Now the temp element in A[i] will be Assigned in A[min]
            }
        }
    }
/*
1 2 4 6 7 8 
*/



