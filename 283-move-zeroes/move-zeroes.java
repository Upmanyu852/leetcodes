class Solution {
    public void moveZeroes(int[] nums) {

        int l = nums.length;
        int temp;

        for (int i = 0; i < l; i++) {

            if (nums[i] == 0) {

                for (int j = i + 1; j < l; j++) {

                    if (nums[j] != 0) {
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;   // ⭐ VERY IMPORTANT
                    }
                }
            }
        }
    }
}
