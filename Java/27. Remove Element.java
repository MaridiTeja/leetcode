package Java;
class Solution {
    public int removeElement(int[] nums, int val) {

        int curr = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val) continue;
            nums[curr++] = nums[i];
        }
        return curr;
    }
}