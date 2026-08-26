class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] output              = new int[k];

        for(int i=0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < output.length; i++) {
            int maxFrequency = -1;
            int mostFrequentKey = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if (entry.getValue() > maxFrequency) {
                    maxFrequency = entry.getValue();
                    mostFrequentKey = entry.getKey();
                }
            }
            output[i] = mostFrequentKey;
            map.remove(mostFrequentKey);
        }

    return output;
    }
}