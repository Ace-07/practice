class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            String storeA = "";
            String storeB = "";
            //2 array of the anagram are created
            int sLen = s.length();
            int[] A = new int[sLen];
            int[] B = new int[sLen];
            for (int i = 0; i < sLen; i++) {
                A[i] = s.charAt(i);
            }
            for (int i = 0; i < sLen; i++) {
                B[i] = t.charAt(i);
            }
            mergesort(A);
            mergesort(B);
            for (int i = 0; i < sLen; i++) {
                storeA=storeA+((char) A[i]);
            }
            for (int i = 0; i < sLen; i++) {
                storeB=storeB+((char) B[i]);
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
    public static void mergesort(int[] A) {
            int n = A.length;
            if (n < 2) { //base condition as we will wait till only 1 array left
                return;
            }
            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = A[i];
            }
            for (int i = mid; i < n; i++) {
                right[i - mid] = A[i];
            }
            mergesort(left);
            mergesort(right);
            merge(left, right, A);
        }

        public static void merge(int[] L, int[] R, int[] A) {
            int nL = L.length;
            int nR = R.length;
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < nL && j < nR) {
                if (L[i] < R[j]) {
                    A[k] = L[i];
                    k = k + 1;
                    i = i + 1;
                } else {
                    A[k] = R[j];
                    k = k + 1;
                    j = j + 1;
                }
            }
            while (i < nL) {
                A[k] = L[i];
                k = k + 1;
                i = i + 1;
            }
            while (j < nR) {
                A[k] = R[j];
                k = k + 1;
                j = j + 1;
            }
        }
}
