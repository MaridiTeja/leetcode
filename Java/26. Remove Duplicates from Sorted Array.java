package Java;
class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[curr]==nums[i]) continue;
            nums[++curr] = nums[i];
        }

        return ++curr;
        
    }
}