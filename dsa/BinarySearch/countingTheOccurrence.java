

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

            int firstIndex =(BinarySearch(A,n,key,true));
            if (firstIndex == -1){//if first occurrence is -1 means no element found then its direct -1;
                System.out.println("0");
            }
            else {
                int lastIndex = BinarySearch(A, n, key, false);//now we got the first and we will see what is the last 
                System.out.println("Count is "+(lastIndex-firstIndex+1));//last index - starting index will tell the number of count
            }

        }
        public static int BinarySearch(int[]A, int n , int key,boolean search){
            int low = 0;
            int high = n-1;
            int result = -1;
            while(low<=high){
                int mid = low + (high - low)/2;
                if (A[mid]==key){
                    result = mid;
                    if (search)//First true will see how many are on lower side
                        high= mid-1;
                    else//then false will see how many are on higher side
                        low = mid+1;
                } else if (A[mid]>key) {
                    high = mid - 1;
                }
                else
                    low = mid + 1;
            }
            return result;
        }
    }
/*
3
*/


