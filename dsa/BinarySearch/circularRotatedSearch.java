

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
            int[] A = {10 , 11 , 12 , 1 , 2 , 3 , 4 , 5};
            int n = A.length;
            int x = 10;
            System.out.println(SortedarrayRotation(A,n,x));

        }
        public static int SortedarrayRotation(int[]A , int n, int x){
            int low = 0;
            int high = n-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if (A[mid]==x){//case 1: found the number
                    return mid;
                }
                if(A[mid]<=A[high]){//case 2: Right half is sorted
                    if (x >A[mid] && x<= A[high]){
                        low = mid +1;//go searching in right sorted half
                    }
                    else
                        high = mid - 1;//go searching left
                }
                else {//case 3: Left half is sorted
                    if (A[low]<=x && x < A[mid]){
                        high = mid - 1;//go searching in left sorted half
                    }
                    else
                        low = mid+1;// go searching right
                }
            }
            return -1;
        }
    }



/*
0
*/
