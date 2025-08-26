

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
//this way we get to create an dublicate list and store orignial and the idea was to sort the word one by one by mergesort but i lack knowledge in maps so i stopped at this
      //and i will try to solve this using maps .
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<String> words = new ArrayList<>(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
            List<String> Dublicate =words;
            for(int i = 0;i<Dublicate.size();i++){
                String s = Dublicate.get(i);
                Dublicate.remove(i);
                int len = s.length();
                String Store="";
                int A[] = new int[len];
                for (int j = 0; j < len; j++) {
                    A[j] = s.charAt(j);
                }
                mergesort(A);
                for (int k = 0; k < len; k++) {
                    Store=Store+((char) A[k]);
                }
                Dublicate.add(i,Store);

            }
            System.out.println(Dublicate);
            List<Integer>order =new ArrayList<>();
            int count = 0;
            order.add(0);
            for (int i = 0;i<Dublicate.size();i++){

            }
        }
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

//            String storeA = "";
//            String storeB = "";
//            String s = "anagram";
//            String t = "nagaram";
//            int start =0;
//
//            int sLen = s.length();
//            int end = sLen-1;
//            int[] A = new int[sLen];
//            for (int i = 0; i < sLen; i++) {
//                A[i] = s.charAt(i);
//            }
//
//            QuickSort(A,start,end);
//            for (int i = 0; i < sLen; i++) {
//                storeA=storeA+((char) A[i]);
//            }
//            System.out.println(storeA);
//
//        }
//
//        public static void QuickSort(int[] A, int start,int end) {
//            if(start<end){
//                int pIndex =Partition(A,start,end);//here recursion will happen, so here it will get the partition result
//                QuickSort(A,start,pIndex-1);//it will again cut the new founded partition into two part this will handle the left one
//                QuickSort(A,pIndex+1,end);//this will handle the right phase
//            }
//        }
//        public static int Partition(int[] A, int start,int end) {
//            int pivot = A[end];
//            int pIndex = start;
//            for (int i = start ; i <end;i++){
//                if (A[i]<= pivot){
//                    int temp = 0;
//                    temp=A[pIndex];
//                    A[pIndex]=A[i];
//                    A[i]=temp;
//                    pIndex =pIndex+1;
//                }
//            }
//            int temp = A[pIndex];
//            A[pIndex] = A[end];
//            A[end] = temp;
//            return pIndex;
//
//
//        }
//    }
//
//
//
//
//
