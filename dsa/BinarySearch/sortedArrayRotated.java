

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
            int[] A = {10,11,12,1,2,3,4,5,6,7};
            int n = A.length;
            System.out.println(BinarySearch(A,n));

        }
        public static int BinarySearch(int[]A, int n){
            int low = 0;
            int high =n-1;
            while(low <=high){
                if (A[low]<=A[high]){
                    return low;
                }
                int mid = low + (high-low)/2;
                int next = (mid +1)%n;
                int prev =(mid +n - 1)%n;
                if (A[mid]<=A[next]&&A[mid]<=A[prev]) {
                    return mid;
                }
                else if (A[mid]<=A[high]) {
                    high = mid - 1;
                }
                else if (A[mid]>=A[low]){
                    low = mid +1;
                }


            }
            return -1;

        }
    }
/*
3
*/
