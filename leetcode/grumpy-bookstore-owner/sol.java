class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int[] unsatisfied = new int[customers.length];
        for (int i= 0; i<customers.length;i++){
            if(grumpy[i] == 1 ){
                unsatisfied[i]= customers[i];
            }
            else {
                unsatisfied[i]=0;
            }
        }
        //sliding window
        int sum = 0;
        for (int i = 0;i<minutes;i++){
            sum = sum+unsatisfied[i];
        }
        int max_sum = sum;
        for (int i= minutes;i<unsatisfied.length;i++){
            sum = sum-unsatisfied[i-minutes];
            sum = sum + unsatisfied[i];
            if(sum>max_sum){
                max_sum= sum;
            }
        }
        int happy = 0;
        for (int i =0;i<customers.length;i++){
            if (grumpy[i]==0){
                happy = happy +customers[i];
            }
        }
        happy = happy + max_sum;
        return happy;
        
    

}
}
