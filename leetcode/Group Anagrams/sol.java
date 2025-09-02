class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();// we create a string to list key value pair to sort out all the matching words
        for (String word:strs){// we will itirate every single word one at a time
            char[] c = word.toCharArray();// we will create an array to contain every single alpabet that we get from string.
            Arrays.sort(c);// then we will use in built sorting algorithm... we can also built sorting algo like merge sort of quick sort for nlog n
            String key = new String(c);// we will again make the sorted characted into string ex....{'a','b','c'} is converted into "abc"
            map.computeIfAbsent(key,k->new ArrayList<>()).add(word);//then we will create a empty array with a specific key assigned for each new string iteration
                                                                    //if the new upcoming word is similar to the key we will add else we will again create a new array
                                                                    //assigning the new key in it.
        }
        return new ArrayList<>(map.values());
    }
}
