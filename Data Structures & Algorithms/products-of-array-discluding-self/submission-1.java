class Solution {
        public int[] productExceptSelf(int[] nums) {
        int[] productWithoutSelf = new int[nums.length];

        int prefix  = 1;
        int suffix  = 1;

        for (int i=0; i<nums.length; i++){
            productWithoutSelf[i] = 1;
        }

        for (int i=0; i<nums.length; i++){
            productWithoutSelf[i] *= prefix;
            prefix *= nums[i];  
        }

        for (int j=nums.length-1; j>=0; j--){
            productWithoutSelf[j] *= suffix;
            suffix *= nums[j];
        }

        return productWithoutSelf;
    }
}  
