

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
            int[] A = {1,2,4,4,4,5,6,7};
            int key = 4;
            int n = A.length;

            System.out.println(BinarySearch(A,n,key));
        }
        public static int BinarySearch(int[]A, int n , int key){
            int low = 0;
            int high = n-1;
            int result = -1;
            while(low<=high){
                int mid = low + (high - low)/2;
                if (A[mid]==key){
                    result= mid;
                    low= mid+1;//it search the higher most side by setting low greater index
                } else if (A[mid]>key) {
                    high = mid - 1;
                }
                else
                    low = mid+1;
            }
            return result;
        }
    }
/*
4
*/


