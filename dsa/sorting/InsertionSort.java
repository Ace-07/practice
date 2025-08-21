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
            Insertionsort(A,n);
            for (int i = 0 ;i<n;i++){
                System.out.print(A[i]+" ");
            }

        }

        public static void Insertionsort(int[] A, int n) {
            for (int i = 1 ; i < n ;i++)
                {
                    int value = A[i];
                    int hole = i;
                    while(hole>0&&A[hole-1]>value){//base case 
                        A[hole]=A[hole-1];
                        hole = hole-1;
                    }
                    A[hole]=value;
                }

            }
        }
/*
1 2 4 6 7 8 
*/


