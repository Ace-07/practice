class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            String storeA = "";
            String storeB = "";

            for (char i = 'a'; i < 'z'; i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == i) {
                        storeA = storeA + i;
                    }
                    if (t.charAt(j) == i) {
                        storeB = storeB + i;
                    }
                }

            }
            if(storeA.equals(storeB)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
