import java.util.Scanner;
import java.lang.Math;
class Main {

    static boolean isPrime(int n)
    {

        if (n <= 1 )
            return false;
        if (n == 4)
            return false;

        for (int i = 2; i < Math.sqrt(n); i++) // if we find the cofactor of n we will see a partern of  a x b = n; where a < b until its sqrt or equivalent to sqrt then b > a after sqrt unless it is 4 so to make it simple we can
                                               // check if a is divided by n and if it is its not a prime;
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int check = 0;
        System.out.println("check if s is a prime number "+s);
        for (int i = 1 ; i <= s ; i++) {


            if (isPrime(i)) {
                System.out.println("prime "+i);
            } else {
                System.out.println("not prime "+ i);
            }
        }


    }
}
