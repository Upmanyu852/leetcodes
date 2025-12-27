class Solution {
    public void moveZeroes(int[] nums) {

        int l = nums.length;
        int j = 0;

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
                
            }
        }

        // Step 2: Fill remaining places with 0
        while (j < l) {
            nums[j++] = 0;
        }
    }
}
