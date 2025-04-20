/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/
class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int value = s.length();

        for (int i = 0; i < value;i++){
            char ch1= s.charAt(i);
            if ((i+1)< value && getVal(ch1) <getVal(s.charAt(i+1))){ 
                sum = sum -getVal(ch1);
            }
            else {
                sum = sum+ getVal(ch1);
            }
        }
        return sum;
    }
    public int getVal(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;        
    }

}
}
