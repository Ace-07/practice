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
            int[] A = {4, 1,2,6, 7, 8, };
            int n = 6;
            Bubblesort(A,n);
            for (int i = 0 ;i<n;i++){
                System.out.print(A[i]+" ");
            }

        }

        public static void Bubblesort(int[] A, int n) {
            for (int i = 0 ; i < n ;i++)
                {
                    int flag=0;//checking if we are entering the loop or not or else we have to go through all n iteration
                    for(int j = 0 ; j<n-1;j++){
                        if (A[j]>A[j+1]){
                            int temp = 0;
                            temp = A[j];//ONly swap
                            A[j]=A[j+1];
                            A[j+1]=temp;
                            flag =1;
                        }
                    }
                    if(flag == 0) {
                        break;
                    }
                }

            }
        }
/*
1 2 4 6 7 8 
*/



