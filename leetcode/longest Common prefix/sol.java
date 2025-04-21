/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/
class Solution {
    public static String Common(String s1, String s2) { // this is taking 2 element and comparing them then appending them and storing it 
        int min = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder(); // this StringBuiler was new for me; 
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            } else {
                break;
            }

        }
        return sb.toString();// toString is also new for me 
    }

    public String longestCommonPrefix(String[] strs) {
        String res = strs[0]; // the first string is taken as answer and them compare them to others 
        for (int i = 1; i < strs.length; i++) {
            res = Common(res, strs[i]); // result is updating
        }
        return res;
        
    }
}



/* This is my wrong code /it was looping to every element and it was wrong
public static void main(String[] args) {
        String arr[] = {"dog","racecar","car"};//"dog","racecar","car""flower","flow","flight"]
        String strs = "";

        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                for (int j = 1; j < (arr.length); j++) {
                    if (arr[i].charAt(i) == arr[j].charAt(i)) {
                        System.out.println(arr[i]); System.out.println(arr[j]);
                        System.out.println(arr[i].charAt(i)); System.out.println(arr[j].charAt(i));
                        strs = strs + arr[i].charAt(i);
                    }
                    else{
                        break;
                    }


                }

            }
        System.out.println(strs);
        }
    }*/
