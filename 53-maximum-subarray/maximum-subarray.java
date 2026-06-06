class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int mxsum=nums[0];//we addede first number as max number
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>mxsum)//if sum is grater than mxsum then initialise max sum with sum value
            mxsum=sum;
            if(sum<0)//if sum is negative then we cannot considered as max subaarary so we declare the sum 0
            sum=0;
        }  
        return mxsum;
    }
}