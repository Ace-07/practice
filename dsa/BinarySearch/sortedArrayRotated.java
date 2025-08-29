

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
                if (A[low]<=A[high]){//case 1
                    return low;
                }
                int mid = low + (high-low)/2;
                int next = (mid +1)%n;//we are using module to make sure it will not go out of bound.
                int prev =(mid +n - 1)%n;
                if (A[mid]<=A[next]&&A[mid]<=A[prev]) {//case 2  if we take an array 10 12 1 2 3 4 and we get 2nd index as mid we can see 1 is less than 12 and also less than 2.
                    return mid;// it is the only element in this array which both next and prev greater than it.
                }
                else if (A[mid]<=A[high]) {//case 3 if mid element is lower than right most it means rest of the index is sorted soo no need to check again
                    high = mid - 1;
                }
                else if (A[mid]>=A[low]){// case 4 if mid element is greater than right most index it means left most is also sorted
                    low = mid +1;
                }


            }
            return -1;

        }
    }
/*
3
*/
