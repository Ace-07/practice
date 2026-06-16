public static void sorting(List<Integer>arr, int start,int end){
        if(start<end){
            int pIndex = Partition(arr,start,end);
            sorting(arr, start, pIndex-1);
            sorting(arr, pIndex+1, end);
        }
    }
    public static int Partition(List<Integer>ar,int start ,int end){
        int pivot = ar.get(start);
        int pIndex = start+1;// 5 6 7 3 5 // 1,4
        for (int i = start + 1; i < end; i++){
            if (ar.get(i)<= pivot){
                //swap
                int temp = 0;
                temp = ar.get(i);
                ar.set(i, ar.get(pIndex));
                ar.set(pIndex,temp);
                // increment the value
                pIndex++;
            }
        }
        //swap the pivot and pIndex
        int temp = 0;
        temp = ar.get(pIndex-1);
        ar.set(pIndex - 1, ar.get(start));
        ar.set(start,temp);
        return pIndex - 1;
    }

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
     

    public static List<Integer> quickSort(List<Integer> arr) {
        int n = arr.size();
        int start = 0;
        int end = n;
        sorting(arr,start,end);
        return arr;
   
    }
