class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            String storeA = "";
            String storeB = "";
            //2 array of the anagram are created
            int sLen = s.length();
            int start = 0;
            int end = sLen-1;
            int[] A = new int[sLen];
            int[] B = new int[sLen];
            for (int i = 0; i < sLen; i++) {
                A[i] = s.charAt(i);
            }
            for (int i = 0; i < sLen; i++) {
                B[i] = t.charAt(i);
            }
            QuickSort(A,start,end);
            QuickSort(B,start,end);
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
    public static void QuickSort(int[] A, int start,int end) {
            if(start<end){
                int pIndex =Partition(A,start,end);//here recursion will happen, so here it will get the partition result
                QuickSort(A,start,pIndex-1);//it will again cut the new founded partition into two part this will handle the left one
                QuickSort(A,pIndex+1,end);//this will handle the right phase
            }
        }
        public static int Partition(int[] A, int start,int end) {
            int pivot = A[end];
            int pIndex = start;
            for (int i = start ; i <end;i++){
                if (A[i]<= pivot){
                    int temp = 0;
                    temp=A[pIndex];
                    A[pIndex]=A[i];
                    A[i]=temp;
                    pIndex =pIndex+1;
                }
            }
            int temp = A[pIndex];
            A[pIndex] = A[end];
            A[end] = temp;
            return pIndex;


        }
}
