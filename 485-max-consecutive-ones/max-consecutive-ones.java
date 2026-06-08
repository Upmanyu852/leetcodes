class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1) currCount++;
            else{
                maxCount = Math.max(currCount,maxCount);
                currCount = 0;
            }
        }
        return Math.max(currCount,maxCount);//it due to last one counter will not be covered in else part hence max count will not be updated
    }
}