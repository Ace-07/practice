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
            int[] A = {4, 1, 2, 6, 7, 9,8,4,5,6,7,8,0};
            int n =A.length;
            int key =5;
            int start=0;
            int end=n-1;
            QuickSort(A,start,end);
            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
            System.out.println(BinarySearch(A,end,key));

        }


        public static void QuickSort(int[] A, int start,int end) {
            if(start<end){
                int pIndex =Partition(A,start,end);
                QuickSort(A,start,pIndex-1);
                QuickSort(A,pIndex+1,end);
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
        public static int BinarySearch(int[] A,int end, int key){
            int start = 0;
            while(start<=end){
                int mid = start +(end - start)/2;
                if (A[mid] == key){
                    return mid;
                } else if (key>A[mid]) {
                    start = mid+1;
                }
                else{
                    end = mid - 1;
                }
            }
            return -1;
        }

    }



