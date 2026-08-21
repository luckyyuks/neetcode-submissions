class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=nums.length-1; i>= 0; i--){
            if(map.containsKey(nums[i])){
                return new int[] {i, map.get(nums[i])};
            }

            map.put((target-nums[i]), i);
        }     

        return new int[] {};
    }
}
