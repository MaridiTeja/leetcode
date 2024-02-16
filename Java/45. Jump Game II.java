package Java;
class Solution {
    public int jump(int[] nums) {
        int n = nums.length,max=0,ans=0,prev=0;
        for(int i=0;i<n-1;i++){
            // System.out.println(prev+" "+max);
            max = Math.max(max,nums[i]+i);
            if(i==prev){
                ans++;
                prev=max;
            }
        }

        return ans;
        
    }
}