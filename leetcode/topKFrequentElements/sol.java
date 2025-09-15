class Solution {
 
 
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            int count = 1;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap =
                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            heap.add(entry);
            if (heap.size()>k){
                heap.poll();
            }
        }
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {  // largest frequency first
            result[i] = heap.poll().getKey();
        }

        return result;

    }
}
/*
Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]
*/
