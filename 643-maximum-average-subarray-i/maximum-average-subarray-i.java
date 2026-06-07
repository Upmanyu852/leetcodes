class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = k;
        int max = 0;
        for(int t=0; t<k; t++){
            max += nums[t];
        }
        int sum = max;
        while(j<nums.length){
            sum = sum + nums[j] -nums[i];
            i++;
            j++;
            max = Math.max(max,sum);
        }
        return (double)max/k;
    }
}