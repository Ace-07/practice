public static List<Integer> breakingRecords(List<Integer> scores) {
        int[] ar = new int[scores.size()];
        for(int i = 0; i<scores.size();i++){
            ar[i]=scores.get(i);
            
        }
        int w = 0;
        int l = 0;
        int winner = 0;
        int looser=0;
        int i = 1;
        int j = 1;
        int size = scores.size();
        while (i<size&&j<size){
            //loser
            if (ar[l]> ar[j]){
                l = j;
                looser++;
                j++;
            }
            else{
                j++;
            }

            //winner
            if(ar[w] >ar[i]){

                i++;
            } else if (ar[w]==ar[i]) {
                i++;
            } else {
                w = i;
                System.out.println(ar[w]);
                winner++;
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();

        result.add(winner);
        result.add(looser);

        return result;
        
    }

}
