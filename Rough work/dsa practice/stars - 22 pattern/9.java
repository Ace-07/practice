
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char ch = '*';

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            for (int p = 0 ; p< n - (i+1); p++) {
                System.out.print(" ");

            }
            for (int q = n - i ;q<n;q++){
                System.out.print(ch);


            }
            for (int r = n ; r < (i+1)+n;r++){
                System.out.print(ch);

            }
            System.out.println();
        }
        for (int s = 0; s < n; s++) {

            for (int k = 0; k < s; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j < n - s; j++) {
                System.out.print(ch);


            }
            for (int m = 0; m < n - s; m++) {
                System.out.print(ch);
            }
            System.out.println();
        }




        }
    }

/*
3
  *
 ***
*****
*****
 ***
  *
*/



