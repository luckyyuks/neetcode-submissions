class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums.sort();
        i = 1;
        while i < len(nums):
            if nums[i] == nums[i-1]:
                return True;
            i = i + 1;   
        return False; 
