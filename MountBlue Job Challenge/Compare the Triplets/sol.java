public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int size = a.size();
        int i =0;
        int alice=0;
        int bob = 0;
        while(i<size){
            if(a.get(i)==b.get(i)){
                i++;
            }
            else if(a.get(i)>b.get(i)){
                alice++;
                i++;
            }
            else{
                bob++;
                i++;
            }
        }
        return Arrays.asList(alice,bob);
    }

}
