class Solution {
    public boolean isAnagram(String s, String t) {
        List<String> list = new ArrayList<>();
      //Adding it inside the list
        list.add(s);
        list.add(t);
      //map to see how many list will key value pair will be create
        Map<String,List<String>> map = new HashMap<>();
        for (String word : list){
            char [] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(word);
        }
      //if it has more than 1 key value (max will be 2 obviously) it mean both are not same so no anagram for it
        if(map.keySet().size()<2){
            return true;
        }
        else{
            return false;
        }
    }
}
