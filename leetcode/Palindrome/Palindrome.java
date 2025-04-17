/*9. Palindrome Number*/
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        
        
        if (temp < 0){   /* If the number is negetive the ans is automatically false because -121 != 121- */
            return false;
        }
        else{
            while (x!=0){  /*reverse a number */
                int digit = x %10;
                reverse = reverse *10 +digit;
                x=x/10;
            }

            if (temp == reverse){
                return true;
        }
            else{
                return false;
        }
    }
    }
}
