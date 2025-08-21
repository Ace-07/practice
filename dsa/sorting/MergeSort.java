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
            int[] A = {4, 1,2,6, 7, 8 };
            int n = 6;
            mergesort(A);
            for (int i = 0 ;i<n;i++){
                System.out.print(A[i]+" ");
            }

        }
        /*
        First one will divide the array till one is left 
        the second one will choose which is the shortest one of both and will merge them both
        */
      
        public static void mergesort(int[] A){
            int n = A.length;
            if (n<2){ //base condition as we will wait till only 1 array left
                return;
            }
            int mid = n/2;
            int[] left = new int[mid];
            int[] right = new int[n-mid];
            for (int i = 0 ; i<mid ;i++){
                left[i]= A[i];
            }
            for (int i = mid; i<n ; i++){
                right[i-mid]=A[i];
            }
            mergesort(left);
            mergesort(right);
            merge(left,right,A);
        }

        public static void merge(int[] L, int[] R, int[] A) {
            int nL = L.length;
            int nR = R.length;
            int i = 0;
            int j = 0;
            int k = 0;
            while(i<nL && j<nR){
                if (L[i]< R[j]){
                    A[k] = L[i];
                    k = k+1;
                    i = i+1;
                }
                else {
                    A[k] = R[j];
                    k=k+1;
                    j=j+1;
                }
            }
            while(i<nL){
                A[k]=L[i];
                k=k+1;
                i=i+1;
            }
            while(j<nR){
                A[k]=R[j];
                k=k+1;
                j=j+1;
            }
            }
        }
/*
1 2 4 6 7 8 
*/



