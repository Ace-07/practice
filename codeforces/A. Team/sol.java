/*A. Team
time limit per test2 seconds
memory limit per test256 megabytes
One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.

This contest offers n problems to the participants. For each problem we know, which friend is sure about the solution. Help the friends find the number of problems for which they will write a solution.

Input
The first input line contains a single integer n (1 ≤ n ≤ 1000) — the number of problems in the contest. Then n lines contain three integers each, each integer is either 0 or 1. If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.

Output
Print a single integer — the number of problems the friends will implement on the contest.*/
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] store = new int[3];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int res = 0;
            for (int j = 0; j < store.length; j++) { // we put for each iteration and we refresh it evertime
                store[j] = sc.nextInt();

            }
            for (int k = 0; k<store.length;k++){// we see what is the result 

                res = res +store[k];

            }
            if (res>1){// if the res is greater than 1 it means more than 1 student is interested in the answer and we can say the question can be answered
                count = count +1;
            }



        }
        System.out.println(count);
    }
}
