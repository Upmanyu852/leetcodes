class Solution {
    public int missingNumber(int[] nums)
     {//nums=[3,0,1]
        int n=nums.length;//n=3
        int expectedSum=(n*(n+1))/2;//expectedSum=6
        int actualSum=0;// actual sum

        for(int num:nums){
            actualSum+=num;//ActualSum=3+1+0=4
        }

        return expectedSum-actualSum;//6-4=2
        
     }
}