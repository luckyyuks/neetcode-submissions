class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int firstPointer;
        int secondPointer;
        List<List<Integer>> myList = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for(int i=0; i < nums.length; i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;  

            firstPointer  = i + 1;
            secondPointer = nums.length - 1;

            while(firstPointer < secondPointer){
                int sum = nums[i] + nums[firstPointer] + nums[secondPointer];

                if (sum == 0) {
                    myList.add(Arrays.asList(nums[i], nums[firstPointer], nums[secondPointer]));
                    firstPointer++;
                    secondPointer--;
                    while (firstPointer < secondPointer && nums[firstPointer] == nums[firstPointer - 1]) {
                        firstPointer++;
                    }
                }

                else if(sum < 0) {
                    firstPointer++;
                }

                else {
                    secondPointer--;
                }
            }
        }   
        return myList;
    }
}
