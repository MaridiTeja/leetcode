/**
 * @param {number[]} nums
 * @return {number}
 */
 var removeDuplicates = function(nums,val) {

    let curr = 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === val) continue;
        nums[curr++] = nums[i];
    }
    return curr;
    
};