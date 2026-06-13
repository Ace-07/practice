public static int sockMerchant(int n, List<Integer> ar) {       
        Map<Integer,Integer>map = new HashMap<>();
        for(int num : ar){
            map.put(num, map.getOrDefault(num, 0)+1);// if the number is there add freq 1
        }
        int total = 0;
        for (int count:map.values()){
            total = total + count/2;
        }
        
        return total;
        

    }
