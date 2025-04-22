/*           A. Way Too Long Words
time limit per test1 second
memory limit per test256 megabytes
Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

Input
The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.

Output
Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.*/
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] word = new String[n];


        for (int i = 0 ; i<n; i++){
            word[i] = scanner.nextLine();

        }

        for (int i = 0 ;i<n;i++){
            if(word[i].length()> 10){ 
                char chf ;
                char chl ;
                int total= word[i].length()-2;

                chf = word[i].charAt(0);
                chl = word[i].charAt(word[i].length()-1); // i first used a for loop for this but i dont knw why it didnt work on big answer so i just used basic
                //for (int j = word[i].length() - 1;i<word[i].length();i++){
                 //   chl = word[i].charAt(j);
                //
                System.out.println(""+chf+total+chl);



            }
            else{
                System.out.println(word[i]);
            }
        }


    }
}



