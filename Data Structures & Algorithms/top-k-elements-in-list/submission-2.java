// Min Heap Solution with Time complexity: O(nlogk) and space complexity: O(n+k)

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq      = new List[nums.length + 1];

        for(int i = 0; i < freq.length ; i++){
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            freq[entry.getValue()].add(entry.getKey()); 
        }

        int[] output = new int[k];
        int index    = 0; // to keep track of non zero elements going into result array
        for (int i = freq.length - 1; i > 0; i--) { // go down the list to get highest frequency elements first
            for (int n : freq[i]) {
                output[index++] = n; // add first and then increment index?
                if (index == k) { // is it still necessary to add i < k  condition in for loop then?
                    return output;
                }
            }
        }
    return output;
    }
}