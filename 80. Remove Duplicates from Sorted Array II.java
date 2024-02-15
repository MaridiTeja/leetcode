class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            if(curr<2 || nums[curr-2]!=nums[i]){
                nums[curr++] = nums[i];
            }
        }

        return curr;
        
    }
}