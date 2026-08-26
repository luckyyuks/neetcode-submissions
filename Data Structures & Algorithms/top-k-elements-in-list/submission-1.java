// Min Heap Solution with Time complexity: O(nlogk) and space complexity: O(n+k)

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] output              = new int[k];

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]); // frequency in ascending order so smallest frequency is on top and can be polled when k is exceeded

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            heap.offer(new int[]{entry.getValue(), entry.getKey()}); //[frequency, value]
            if(heap.size() > k){
                heap.poll(); //removes smallest frequency (at the top of the heap since it's in ascending order)
            }
        }

        for (int i = 0; i < k; i++) {
            output[i] = heap.poll()[1]; // 1 because it adds the actual value not the frequency
        }

    return output;
    }
}