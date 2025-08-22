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
            int[] A = {4, 1, 2, 6, 7, 8,4,5,6,7,8,0};
            int n =A.length;
            int start=0;
            int end=n-1;
            QuickSort(A,start,end);
            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
            }

        }


        public static void QuickSort(int[] A, int start,int end) {
            if(start<end){
                int pIndex =Partition(A,start,end);//here recursion will happen, so here it will get the partition result
                QuickSort(A,start,pIndex-1);//it will again cut the new founded partition into two part this will handle the left one
                QuickSort(A,pIndex+1,end);//this will handle the right phase
        }
        }
        public static int Partition(int[] A, int start,int end) {
            int pivot = A[end];
            int pIndex = start;
            for (int i = start ; i <end;i++){
                if (A[i]<= pivot){
                    int temp = 0;
                    temp=A[pIndex];
                    A[pIndex]=A[i];
                    A[i]=temp;
                    pIndex =pIndex+1;
                }
            }
            int temp = A[pIndex];
            A[pIndex] = A[end];
            A[end] = temp;
            return pIndex;


        }

    }

/*
0 1 2 4 4 5 6 6 7 7 8 8 
*/



