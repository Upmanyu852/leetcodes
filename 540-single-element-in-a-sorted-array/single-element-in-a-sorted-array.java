class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length; 
        int st = 0;
        int end = n - 1;

        if (n == 1) return nums[0]; // guard for single-element array

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (mid == 0) {
                if (nums[mid] != nums[mid + 1]) {
                    return nums[mid];
                }
            }

            if (mid == n - 1) {
                if (nums[mid] != nums[mid - 1]) {
                    return nums[mid];
                }
            }

            if (mid > 0 && mid < n - 1) { // guard added here
                if (nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid]) {
                    return nums[mid];
                }
            }

            if (mid % 2 == 0) { // even
                if (mid < n - 1 && nums[mid + 1] == nums[mid]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { // odd
                if (mid < n - 1 && nums[mid] == nums[mid + 1]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }

        return -1; // shouldn't reach here for valid input
    }
}